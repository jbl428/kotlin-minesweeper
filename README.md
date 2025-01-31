# kotlin-minesweeper

## 기능 요구사항

- 높이와 너비, 지뢰 개수를 입력받을 수 있다.
- 지뢰는 눈에 잘 띄는 것으로 표기한다.
- 지뢰는 가급적 랜덤에 가깝게 배치한다.
- 각 사각형에 표시될 숫자는 자신을 제외한 주변 8개 사각형에 포함된 지뢰의 개수다.
- 지뢰가 없는 인접한 칸이 모두 열리게 된다.

## 실행 결과

```
높이를 입력하세요.
10

너비를 입력하세요.
10

지뢰는 몇 개인가요?
10

지뢰찾기 게임 시작
open: 1, 1
0 1 C C C C C C C C
0 1 C C C C C C C C
0 1 C C C C C C C C
1 1 C C C C C C C C
C C C C C C C C C C
C C C C C C C C C C
C C C C C C C C C C
C C C C C C C C C C
C C C C C C C C C C
C C C C C C C C C C

open: 4, 1
Lose Game.
```

## 프로그래밍 요구사항

객체지향 생활 체조 원칙을 지키면서 프로그래밍한다.

### 객체지향 생활 체조 원칙

- 한 메서드에 오직 한 단계의 들여쓰기만 한다.
- else 예약어를 쓰지 않는다.
- 모든 원시 값과 문자열을 포장한다.
- 한 줄에 점을 하나만 찍는다.
- 줄여 쓰지 않는다(축약 금지).
- 모든 엔티티를 작게 유지한다.
- 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.
- 일급 컬렉션을 쓴다.
- getter/setter/프로퍼티를 쓰지 않는다.

## 도메인 클래스

- Board: 지뢰찾기 게임 보드
- Cell: 보드 안의 각 항목
- Point: 점 위치정보
- Coordinate: Cell 의 위치
- Mine: 지뢰를 가진 Cell
- Empty: 지뢰가 없는 Cell
- Row: Cell 들을 가진 행
- Game: Board 를 만드는 역할
