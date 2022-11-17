# Spring 멀티 모듈 설계 1

* applications
  * 어플리케이션 동작과 관련된 구현을 넣는다.
  * domains, common 을 의존할 수 있다.
* domains
  * 도메인 관련 로직을 넣으며, 공유 자원을 반드시 하나는 가지고 있어야 한다.
  * 같은 domain 을 포함하여 의존할 수 있으며 common 을 의존할 수 있다.
* common
  * 공통 코드를 넣으며 그 어느 것도 의존하지 않음

```
applications
ㄴ api
ㄴ batch
common
domains
ㄴ domain-api-h2
ㄴ domain-batch-h2
```

해당 저장소는 api, batch 로 각각 2개의 서버로서 동작되어야 한다고 가정하고 설계한 것
