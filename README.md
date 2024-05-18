# BackEnd

NOW SOPT SOPKATHON ANDROID 1조 서버 레포입니다🍀

## Project
  ### 좋았잖아, 우리
> **NOW-SOPT-SOPKATHON-ANDROID-TEAM1** - Backend<br/>

--- 
<br>

## TEAM
|![image](https://github.com/NOW-SOPT-SOPKATHON-ANDROID-TEAM1/BackEnd/assets/91695537/7cb01573-c47f-407d-9ddc-d3c52671a369)|![image](https://github.com/NOW-SOPT-SOPKATHON-ANDROID-TEAM1/BackEnd/assets/91695537/bb72d82b-343c-4976-82c4-06a71fd4c07b)|
|:---:|:---:|
|최영철|이예린|
|[softmoca](https://github.com/softmoca)|[lxxyxin](https://github.com/lxxyxin)|
|담당|담당|
|- AWS 세팅 및 배포 <br> - ERD 설계 <br> | - config 세팅 <br> - ERD 설계 <br>|

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

## ER Diagram

<br>
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
