# 장비 목록
- URL : http://qxqx.iptime.org/manager.do?acton=equipList
- 소스 : /src/main/java/com/xxx/WriteDeviceList.java
- 비고 : 목록에서 인쇄할 항목을 체크박스로 선택한 후 VO에 밀어넣는다.
    DeviceList constructor -> DATETIME_NOW 에 현재 시간을 넣는다.
- 출력 파일명 : 장비현황.docx

# 수시 점검 일지
- URL : http://qxqx.iptime.org/manager.do?acton=equipChkReportList&check_yymm=2015-11&err_type=&check_gb=&location=&asset_nm=&checker_nm=
- 소스 : /src/main/java/com/xxx/WriteDeviceReportAnytime.java
- 비고 : 선택 파일 클릭 후 인쇄
    DATETIME_NOW 에 현재 시간을 넣는다. INSP_NM = 감독관이름
- 출력 파일명 : 수시점검일지_${CHECK_DATE}.docx

# 주간 점검 일지
- URL : http://qxqx.iptime.org/manager.do?acton=equipWeekSheetList&check_yymm=2015-11
- 소스 : /src/main/java/com/xxx/WriteDeviceReportWeekly.java
- 비고 : 선택 파일 클릭 후 인쇄
    INSPNAME = 감독관이름
- 출력 파일명 : 주간점검일지_${WORK_DATE}.docx

# 스탭 작업 일지
- 소스 : /src/main/java/com/xxx/WriteStaffWorkSheet.java

# 실제로 나와야 하는 파일

    sample/realworld_example.docx

# 예제

- com.xxx.SampleVO.main : class를 이용해서 template render
    - 출력물 : out.vo.docx
- com.xxx.WriteStaffWorkSheet.main : map을 이용해서 template render
    - 출력물 : out.vo.docx

# 참고용

- 문서 : <https://code.google.com/p/xdocreport/wiki/DocxReportingQuickStart>

- VO에서XML 만들어 주는 코드 : GenerateXMLFields.java

- 윈도우10, 워드2007 기준 매크로 실행 방법 및 탬플릿 수정 방법

    - 아래 파일을 다운로드해서 c:\ 에 압축푼다.

        https://code.google.com/p/xdocreport/downloads/detail?name=fr.opensagres.xdocreport.document.tools-1.0.2-distribution.zip&can=2&q=

    - C:\fr.opensagres.xdocreport.document.tools-1.0.2-distribution\macro\XDocReport.dotm 를  아래 폴더에 복사

        %homepath%\AppData\Roaming\Microsoft\Word\STARTUP

    - GenerateXMLFields.java를 실행해서 생긴 "project.fields.xml" 파일을 c:\ 복사

    - 워드 실행, 매크로 허용

    - template 파일을 연다.

    - 위 문서 링크를 따라 탬플릿 수정


