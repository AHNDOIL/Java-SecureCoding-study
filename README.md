# Java-SecureCoding-study

> ### 자바 시큐어 코딩 가이드라인 - 신뢰성 있고 안전한 프로그램을 위한 75가지 권고사항  

 

## 1장. 안전성  
|아이템|링크|
|:---|:---:|
|1. 민감-데이터의 수명을 제한하라 | https://com-squadleader.tistory.com/279 |  
|2. 클라이언트에 암호화되지 않은 민감-데이터를 저장하지 말라 | https://com-squadleader.tistory.com/286 |
|3. 민감한 가변적 클래스에 수정이 불가능한 래퍼를 제공하라 | https://com-squadleader.tistory.com/288 |
|4. 보안에 민감한 메서드들이 검증된 매개변수를 가지고 호출되도록 보장하라 | https://com-squadleader.tistory.com/294 |
|5. 마구잡이 파일 업로드를 방지하라 | https://com-squadleader.tistory.com/295 |
|6. 출력을 적절하게 인코딩하거나 이스케이핑하라 | https://com-squadleader.tistory.com/299 |
|7. 코드 인젝션을 방지하라 | https://com-squadleader.tistory.com/310 |
|8. XPath 인젝션을 방지하라 | https://com-squadleader.tistory.com/311 |
|9. LDAP 인젝션을 방지하라 | https://com-squadleader.tistory.com/312 |
|10. 비신뢰-메서드의 매개변수를 clone() 메서드로 복제하지 말라 | https://com-squadleader.tistory.com/313 |
|11. 암호키를 Object.equals()로 비교하지 말라 | https://com-squadleader.tistory.com/316 |
|12. 안전하지 않거나 약한 암호 알고리즘을 사용하지 말라 | |
|13. 해시 함수를 이용하여 패스워드를 저장하라 | |
|14. SecureRandom에 적절한 시드를 제공하도록 보장하라 | |
|15. 비신뢰-코드가 오버라이드할 수 있는 메서드에 의존하지 말라 | |
|16. 과도한 권한 승인을 삼가하라 | |
|17. 특권-코드를 최소화하라 | |
|18. 비신뢰-코드에게 간소화된 보안 검사를 하는 메서드를 노출시키지 말라 | |
|19. 섬세한 보안을 위해 맞춤형 보안 퍼미션을 정의하라 | |
|20. 보안 관리자를 이용하여 안전한 샌드박스를 생성하라 | |
|21. 비신뢰-코드가 콜백 메서드의 권한을 오용하지 못하도록 방지하라 | |


## 2장. 방어적 프로그래밍  
|아이템|링크|
|:---|:---:|
|22. 변수들의 영역범위를 최소화하라 |  |  


