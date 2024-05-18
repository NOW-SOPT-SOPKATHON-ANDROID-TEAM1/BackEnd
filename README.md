# BackEnd

NOW SOPT SOPKATHON ANDROID 1조 서버 레포입니다🍀

## Project
  ### 좋았잖아, 우리
> **NOW-SOPT-SOPKATHON-ANDROID-TEAM1** - Backend<br/>
#### 서비스 이름 및 간단한 소개
- 서비스 이름: "좋았잖아, 우리"

- 간단한 소개: 사람들은 일상 속에서 +의 감정(긍정적 감정)과 -의 감정(부정적 감정)을 모두 느끼지만, (-)의 감정에 더 매몰되기 때문에, 나의 삶을 “마이너스의 삶”으로 인식하게 됩니다.

**"좋았잖아, 우리" 서비스는 '일상 속 주로 부정적인 감정을 느끼는 사람들이 행복한 순간의 기록을 통해 긍정적인 감정을 리마인드 할 수 있도록' 도와줍니다.**

#### 주요기능
1. 온보딩: 이름 입력 후 좋았던 추억이 담긴 사진 5개 업로드
2. 기록하기: 좋았던 추억이 담긴 사진과 텍스트를 기록하여 업로드
3. 리마인드 팝업: 부정적인 감정을 느낄 경우, 버튼을 클릭 시, 좋았던 추억이 담긴 사진과 텍스트를 담은 팝업창 보여주기

--- 
<br>

## TEAM
|![image](https://github.com/NOW-SOPT-SOPKATHON-ANDROID-TEAM1/BackEnd/assets/91695537/7cb01573-c47f-407d-9ddc-d3c52671a369)|![image](https://github.com/NOW-SOPT-SOPKATHON-ANDROID-TEAM1/BackEnd/assets/91695537/bb72d82b-343c-4976-82c4-06a71fd4c07b)|
|:---:|:---:|
|최영철|이예린|
|[softmoca](https://github.com/softmoca)|[lxxyxin](https://github.com/lxxyxin)|
|담당|담당|
|- AWS 세팅 및 배포 <br> - ERD 설계 <br> - 리마인드 조회 API 구현 | - config 세팅 <br> - ERD 설계 <br> - 기록 생성 API 구현|

<br>

## Tech Stack🛠️
  <img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=Java&logoColor=white"/></a>
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=white"/></a>
  <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=SpringBoot&logoColor=white"/></a>
  <br>
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=flat-square&logo=PostgreSQL&logoColor=white"/></a>
  <img src="https://img.shields.io/badge/AWS-232F3E?style=flat-square&logo=AWSL&logoColor=orange"/></a>
  <img src="https://img.shields.io/badge/AWS_RDS-527FFF?style=flat-square&logo=AWSRDS&logoColor=orange"/></a>
  <img src="https://img.shields.io/badge/AWS_EC2-FF9900?style=flat-square&logo=AWSLEC2&logoColor=orange"/></a>

## Code Convention

### 네이밍 규칙

- lowerCamelCase 사용
    - 클래스, 인터페이스, db스키마의 경우 Upper**CamelCase**
- 함수명 : 동사+명사
    - API와 직결되는 함수는 CRUD 명칭을 앞에 달기
        - ex. Create → create000
              Read → get000 (getUserById, getUsers)
              Update → update000
              Delete → delete000
- 변수명 : 명사+명사 or 형용사+명사
- 명사는 단수로 쓰지 않되 개수를 나타내는 단어 꼭 적어주기
    - ex. 복수 : getUsers() / 단수 : getUser()
    

### 프로젝트 폴더링명

1. 폴더명
    - 소문자 사용
2. 패키지
    - controller
    - service
    - repository

### 함수 네이밍

```
- HTTPMethod + Entity명
ex) getUsers
```

### 서비스 클래스명

```
- Entity명 + Service
ex) UserSevice
```

### 컨트롤러 클래스명

```
- Entity명 + Controller
ex) UserController
```

그 외 모든 변수명은 **lowerCamelCase** 사용

## API 명세서
👉 [ 좋았잖아, 우리 API 명세서 보러가기](https://www.notion.so/API-b8a10ffafdd84a7ba78b130bd21b5152)



## ER Diagram

<br>
<img width="788" alt="스크린샷 2024-05-19 오전 1 19 21" src="https://github.com/NOW-SOPT-SOPKATHON-ANDROID-TEAM1/BackEnd/assets/91695537/17736f87-08e6-487b-9087-e392c4429df3">

<br>


## Directory
```
├─📁 main
│  ├─📁 java
│  │  └─📁 org.sopkathon
│  │      └─📁 practice
│  │         ├─📁 controller
│  │         ├─📁 domain
│  │         ├─📁 external
│  │         ├─📁 repository
│  │         └─📁 service
│  │            └─📁 dto
│  │         
│  └─📁 resources      
│      
└─📁 test
```

<br>
