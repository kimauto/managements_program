<div align="center">

# 

# ![header](https://capsule-render.vercel.app/api?type=venom&color=0:5C258D,100:4389A2&height=300&section=header&text=Management%20Sysetem&fontColor=black&fontSize=50&stroke=5C258D&strokeWidth=1)

</div>

## 📝 소개

통합관리 시스템입니다.

- 프로젝트 소개
- 개발 기간
- 주요 기능
- 프로젝트 API 설계
- 사용한 기술 스택
- 프로젝트 아키텍쳐
- 시연 영상
- 기술적 이슈와 해결 과정
- 프로젝트 팀원

<br />

## 프로젝트 소개

### Version 1: Student Mangement System

- 학생 관리 시스템으로 학생의 정보를 입력 받고 저장, 검색, 정렬하는 기능을 제공합니다.

### Version 2: Management System

- 직원 관리 시스템과 학생 관리 시스템을 통합해 통합 관리 시스템을 구현합니다.

<br>

## 개발 기간

- 2024.2.7(금) ~ 2024.2.10일(월) : 학생관리시스템 설계구조([draw.io](http://draw.io/)) 작성
- V1: 2024.2.11(화) ~ 2024.2.17(월) : 학생관리시스템 코드 구현 (파일쓰기,읽기)
- V2: 2024.2.18(화) ~ 2024.3.7(금) : 학생관리시스템 + 인사관리시스템 통합관리 시스템 코드 구현(MySQL DataBase 연동)

<br>

## 주요 기능

V1(Student Management System)

- 학생 정보 입력
- 학생 정보 검색
- 학생 정보 정렬

V2

<br>

## 🗂️ APIs

작성한 API는 아래에서 확인할 수 있습니다.

👉🏻 [API 바로보기](https://www.notion.so/git-github-1a3a8921a0178060b47fc567d81f734f?pvs=21)

<br />

## ⚙ 기술 스택

> skills 폴더에 있는 아이콘을 이용할 수 있습니다.
> 

### Back-end

<div>
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Java.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Mysql.png?raw=true" width="80">

</div>

### Tools

<div>
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Github.png?raw=true" width="80">

<br />

## 🛠️ 프로젝트 아키텍쳐

![스크린샷 2025-03-15 171534](https://github.com/user-attachments/assets/dcb30837-3dec-47f0-96eb-2b9bc4d201b6)


<br>

## 시연 영상

- 학생 정보 입력

https://github.com/user-attachments/assets/1be88a44-40a5-4622-b291-575d76a72d0e

- 학생 정보 검색

https://github.com/user-attachments/assets/ffc600f9-b006-41a9-90a3-f8c4ceab6bc8

- 학생 정보 정렬

https://github.com/user-attachments/assets/144a989c-220e-42ce-bdef-b27c8acc689f

<br />

## 🤔 기술적 이슈와 해결 과정

본 프로젝트를 진행하며 마주했던 기술적 이슈들과 그 해결 방법은 다음과 같습니다.

✅ 이슈 1: 순서 보장 문제

문제 상황: 정렬(Sorting) 메서드를 실행해도 데이터가 원하는 대로 정렬되지 않는 문제가 발생했습니다.

원인: 기존 HashMap은 데이터의 삽입 순서를 보장하지 않기 때문에 정렬이 제대로 유지되지 않았습니다.

해결 방법: 데이터 구조를 HashMap에서 LinkedHashMap으로 변경하여 데이터 입력 순서를 보장했습니다.

✅ 이슈 2: JSON 파일 처리 오류

문제 상황: Jackson 라이브러리를 사용해 JSON 파일을 읽어올 때 타입 처리 오류가 발생했습니다.

원인: Jackson의 기본 타입 설정이 LinkedHashMap으로 되어 있다는 것을 몰라 타입 변환에서 문제가 생겼습니다.

해결 방법: Jackson의 기본 타입이 LinkedHashMap으로 설정되어 있음을 확인하고 TypeReference<>를 사용하여 JSON 데이터 타입을 명확하게 지정했습니다.

✅ 이슈 3: Git 충돌 문제

문제 상황: 팀원들이 여러 개의 브랜치에서 동시 작업 후 merge할 때 빈번하게 충돌이 발생했습니다.

원인: 공통 작업 영역을 브랜치 별로 명확하게 구분하지 않고, 병합 규칙이 미비하여 충돌이 빈번히 발생했습니다.

해결 방법: 브랜치를 명확한 기능 단위로 나누고, merge 시 충돌을 병합하여 해결했으며, 사전에 정한 merge 규칙을 준수하여 충돌 빈도를 낮추었습니다.

✅ 이슈 4: 캐싱 전략 관련

문제 상황: 파일 입출력 시 성능 저하와 잦은 디스크 접근으로 인해 처리 속도가 느려졌습니다.

해결 방법: JSON 형태로 파일을 저장하는 방식과 함께, 데이터를 메모리에 미리 로딩하여 관리하는 간단한 캐싱 전략을 도입했습니다. 이를 통해 데이터 처리 성능을 개선했습니다.

💻 프로젝트에서의 역할
정렬 기능 구현

총점, 평균, 이름, 학번, 학점 등 다양한 기준으로 학생 데이터를 정렬하는 기능 구현
Comparator와 LinkedHashMap을 활용해 정렬 로직 및 데이터 순서 보장
데이터 유효성 검증 및 예외처리

정렬 전 데이터 존재 여부 및 유효성을 체크하여 예외 상황 관리
명확한 예외 메시지 제공을 통한 사용자 편의성 향상
캐싱 전략 구현

JSON 기반의 데이터 입출력과 함께 캐싱 전략을 통해 성능 최적화
메모리 캐시를 통한 빠른 데이터 접근 구현
코드 구조화 및 최적화

인터페이스 기반의 구조로 확장성과 유지보수성 향상
코드 중복 최소화 및 모듈화로 가독성 제고
