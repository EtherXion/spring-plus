# SPRING PLUS

코드 수정 과제

Lv 1 - 1 @Transactional

@Transactional(readOnly = true) 의 경우 읽기만 가능

생성이 필요한 항목에 @Transactional 추가

Lv 1 - 2 JWT

User 정보에 nickname 추가

Entity , JWT토큰 등에 nickname 추가

Lv 1 - 3 AOP

메소드 실행 전 동작하도록 @Before로 변경

원하는 메소드에 맞게 주소 변경

Lv 1 - 4 컨트롤러 테스트

예외처리 상황을 테스트 하는 코드 

ok 를 BadRequest 로 변경

Lv 1 - 5 JPA

weather , 수정 시각 을 @RequestParam으로 
받도록 컨트롤러 수정

TodoRepository 에 weather 과 수정 시각을 
받아 검색하는 JPQL 작성

Lv 2 - 6 JPA Cascade

cascade = CascadeType.PERSIST 를 추가

PERSIST 와 All 중 뭐가 더 적합한지 생각 필요

Lv 2 - 7 N + 1

TodoRepository 의 쿼리 Fetch Join 으로 수정

Lv 2 - 8 QueryDSL

QueryDSL 사용을 위한 
TodoQueryRepository , 
TodoQueryRepositoryImpl , 
JPAConfiguration 파일 추가

TodoQueryRepositoryImpl 파일에
원본 쿼리 기능 구현

TodoRepository에 상속

Lv 2 - 9 Spring Security

SecurityConfig , 
JwtSecurityFilter , 
JwtSecurityFilter 파일 추가

AuthUser , UserRole Enum 파일 수정

user Entity 의 fromAuthUser 메소드 수정

AuthUser 에 getUserRole 추가

<br>

QueryDSL 코드 작성 과정에서 Q클래스가
제대로 생성되지 않는 오류 발생

검색 결과 스프링 , QueryDSL 의
버전 문제일 가능성이 있어 QueryDSL 의
버전을 직접 지정하는 방식으로 변경했으나
문제 해결 X

Q클래스의 생성 위치가 문제일 가능성이 있어
build.gradle 파일에 직접 Q클래스의
위치를 지정하기 위한 코드 추가

추가 후 빌드 진행 시 오류가 사라짐
