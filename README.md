# 템플릿 파일

    src/main/resources/0.docx

# 실제로 나와야 하는 파일

    sample/realworld_example.docx

# 예제

- com.xxx.SampleVO.main : class를 이용해서 template render
    - 출력물 : out.vo.docx
- com.xxx.SampleUsingMap.main : map을 이용해서 template render
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

