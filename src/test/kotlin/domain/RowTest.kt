package domain

import domain.vo.Point
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class RowTest : FreeSpec({

    "인스턴스 생성 불가능" - {
        "빈 리스트" {
            shouldThrow<IllegalArgumentException> {
                Row.of(emptyList())
            }
        }

        "x 좌표에 빈 항목이 존재" {
            shouldThrow<IllegalArgumentException> {
                val cells = listOf(
                    createMine(1, 1),
                    createEmpty(3, 1),
                )
                Row.of(cells)
            }
        }

        "y 좌표가 모두 동일하지 않음" {
            shouldThrow<IllegalArgumentException> {
                val cells = listOf(
                    createEmpty(1, 1),
                    createMine(2, 2),
                )
                Row.of(cells)
            }
        }
    }

    "주어진 cell 을 가지는 인스턴스가 생성된다" {
        val cells = listOf(
            createMine(1, 2),
            createMine(2, 2),
        )

        val row = Row.of(cells)
        row.size shouldBe 2
    }

    "열 기준으로 정렬된 cell 목록을 반환한다" {
        val cells = listOf(
            createMine(3, 1),
            createEmpty(1, 1),
            createEmpty(4, 1),
            createMine(2, 1),
        )

        val row = Row.of(cells)

        row.cells.map { it.x } shouldBe listOf(1, 2, 3, 4).map(::Point)
    }
})
