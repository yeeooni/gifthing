### 🔔기프티콘 알림 서비스(깊띵) - '이미지로 쿠폰 관리의 신세계!'

#### 🚀프로젝트 소개

당신의 기프티콘은 소리 없이 사라지고 있나요?
"유효기간 지났다고? 내가 받은 게 엊그제 같은데! 😱"

`깊띵`은 기프티콘 + Thing(띵)의 합성어로 기프티콘 이미지를 업로드하면 **자동으로 유효기간을 확인**하고, 기프티콘이 **유효기간을 향해 달려가는 속도**를 실시간 알람으로 알려주는 서비스를 제공합니다.
"**쓰지 못하고 버려지는 기프티콘에 작별을!**"
알람으로 미리미리 사용하고, 더 이상 유효기간에 속지 말아요. 😎

_아이러니하게도 기프티콘 또한 `gift + icon` 의 합성어죠!?_

#### 🛠기술 스택️
##### 백엔드
- springboot 3.4.0 
  - 최신 기술로 무장한 당신의 기프티콘 지킴이!
- JDK 23
  - 우린 현대적인 사람들입니다. 오래된 기술은 _Pass!_
- node.js v18.14.2

##### 프론트엔드
- sass 1.82.0
- vue.js vue-cli 5.0.8
  - 깔끔하고 반응형 UI로 사용자 경험을 극대화합니다.

##### 빌드 도구
- gradle
  - 이렇게 간편한 빌드 도구는 없죠?
  - maven 은 이제 그만!

##### 그 외
- database ???
  - "어떤 DB를 선택해야 기프티콘을 가장 잘 지킬 수 있을까요?"
  - Coming Soon! 🎉
- Hibernate JPA(Java Persistence API) 
  - 손쉬운 매핑, 그렇다면 쿼리에 시간을 절약하고 다른곳에 집중할 수 있지!
  - 간편한 CRUD

#### 🌟전체 개발 프로세스
- 스프링부트로 API 개발 및 데이터 처리
- 뷰로 화면 구성 및 반응형 UI 설계

#### 📸핵심 기능
1. 이미지 업로드
   - 스마트 OCR 을 사용하여 기프티콘 유효기간 자동 추출! 📆
   - "바코드든, QR 코드든 다 읽을 수 있어요.(단, 엉뚱한 손글씨는 안됩니다.)"
2. 유효기간 추적
   - "기프티콘이 유효기간 3일 전에 다가왔습니다!"
   - "오늘이 마지막 날입니다. 지금 당장 카페로 뛰어가세요!"
3. 알림 서비스
   - 메일, SMS, 푸시 알림 모두 OK! 🔔
4. 사용 이력 저장
   - 사용한 기프티콘은 자동으로 히스토리에 저장됩니다.
   - "과연 난 한 달 동안 몇 잔의 커피를 마셨을까?"

#### 🌟기대 효과
- "소중한 기프티콘이 유효기간 속에서 사라지는 비극을 막아줍니다."
- "알람으로 일상을 더 스마트하게 관리해 보세요."
- "카페 주인이 유효기간 지난 기프티콘은 사용할 수 없다고 말하는 비극을 끝냅니다."

#### 🥤커피 한잔?
- 프로젝트가 마음에 드셨다면 ⭐️스타를 눌러주세요!
- 개발자는 여러분의 응원으로 코드를 더 아름답게 만듭니다! 😍

#### ✨Vue.js 설치 및 실행
1. Frontend 디렉토리 이동
```shell
cd frontend
```
2. 패키지 설치
```shell
npm install
```
3. 로컬 서버 실행
```shell
npm run serve
```

#### ✨sass 버전 확인
```
npm show sass version
```

#### ✨css 변환・
```
sass style.css style.scss
```