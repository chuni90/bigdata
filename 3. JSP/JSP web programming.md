## JSP WEB programing

 
|Client|<--Internet-->|Server|
|--|--|--|
|HTML|HTML은 정적webpage 구현 가능, PHP/JSP는 동적webpage 구현 가능|미들웨어(JSP & SERVLET)|			
|CSS|<-틀, 구현|데이터베이스(Oracle 11g)|
|JavaScrpit|<-Event|웹서버(WAS : Apache Tomcat)|
|웹브라우저||

### Tomcat 다운로드 및 이클립스/시스템 설정 
* JSP 교재의 p30 참고 : [3.2 JAVA_HOME 환경 변수 설정] 참고해서 시작

![](./img/set1.png)

![](./img/set2.png)

![](./img/set3.png)

![](./img/set4.png)

![](./img/set5.png)

#### apache tomcat 서버 사용 시, 아래와 같은 폴더 구조로 구성되어 있어야 한다. 
* 이런게 잘 구성되어 있지 않다면, "404 NOT FOUND" 경고가 뜨게 된다. 
* 그래서 폴더와 파일의 구성과 위치가 중요함

1. SRC
2. WEB content
	- HTML
	- CSS
	- JavaScript
	- JSP
	- Image 등

* 전달 및 불러오기 방식
	* Get / Post
		* Get  : 조금 작은 용량, 쿼드스트링 전달
		* Post : Get보다 큰 용량, 보안이 필요할 때(로그인 정보 등
	* Get / Post는 요청(Requset)한대로 Response 해야함 
<hr>
### HTML(Hyper Text Markup Language) => HTTP protocol
#### 1) 목적 : Display = 웹브라우저를 통해서 작성한 글(내용)이 웹 브라우저 상에 어떻게 보여질 지를 지정하는 것
- web page를 작성하기 위한 mark up 언어
- 문서의 구조, 틀, 뼈대를 만드는 언어 => 이걸 꾸며주는 것이 CSS(Style)

#### 2) 구조 = 구문
- 형식
	- tag안에 tag를 넣을 수 있는 경우 : <start태그명> 내용 </end태그명>
	- tag안에 tag를 못 넣는 경우 : <start태그명/>    (바로 열고 닫아버리는 것)
	- 옵션 부여 : <start태그명 옵션내용> 내용 </end태그명>
- 기본 구문 :  *.html , *.htm(확장자 글자수가 4개 넘어가면 못읽는 경우도 있어서 이렇게 줄일 수 있음)   
	- <html>  : root 태그, html 시작, 대소문자 상관없음.
	```
	<html> 
		<head>
			- <title> : 페이지 제목
			- <meta> : 페이지의 정보
				<body>
					- 페이지를 통해서 보여줄 내용을 담는다.
					- 영역을 분할해서 작성하며, 이를 시멘틱 tag라고 한다.
						<header> <nav> <footer>
						<contents> <section> <article> <aside>
				</body>
		</head> 
	```
* 기본 tag
	<p> p :  paragraph, 단락태그
	<br> br : Enter, 줄바꿈 태그<br>
	<b> b : bolder, 글자 진하게<br></b>
	<i> i : italic, 기울임<br></i>
	<u> u :underline, 밑줄, HTML5에선 사용 안 한다네??<br></u>
	<font> font : 글꼴과 관련된 태그<br>
		- 속성(attribute) : size(1~6, default 3), color, face<br>
* ul , ol : 목록을 표현하는 태그, ol : 순서 | ul : 순서없는 태그<br>
* li : 목록에 포함되는 항목
* &nbsp : 스페이스바(공백문자, &nbsp(세미콜론이 붙어야함)) ``&nbsp;``


<h1>This is a Heading</h1>
<h2>H2 This is a Heading</h2>
<h3>H3 This is a Heading</h3>
<h4>H4 This is a Heading</h4>
<h5>H5 This is a Heading</h5>
<h6>H6 This is a Heading</h6>
<p>This is a paragraph.<br>
동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세</p>

<p>
 이 기상과 이 맘으로 충성을 다하여 괴로우라 즐거우나 우리나라 만세
무궁하 삼천리 화려강산 늦은 밤 비가 내려와 널 데려가 
</p>

<hr> hr tag는 한줄 긋기<br>
유재석<br>
지석진<br>
김종국<br> **"기본적으로 br가 p 태그는 줄바꿈 기능은 동일하나 그 간격에서 p태그가 더 넓게 띄어짐.**
<hr>
<p>이광수</p>
<p>송지효</p>
<p>하하</p><hr>

#### 예시페이지 

<b><i><font size="5"> &nbsp;안녕하세요, 메가넥스트 카페입니다.</font></i></b><br>
<font size = "4" color = "blue"> 항상 좋은 재료로 맛있는 커피를 제공하겠슴다.</font>
<hr>
저희가 제공하는 메뉴<br>
<ul>
	<li>아이스 카페</li>
	<li>아이스 모카</li>
	<li>아메리카노</li>
	<li>아이스 카푸치노</li>
</ul>
<hr>
<a href="show.html">메뉴의 세부항목에 대한 설명</a>  
 * a href = "*.html"이라는 태그를 통해 하이퍼링크 설정 가능 
<hr>


### CSS : HTML에 style을 적용하기 위해 만들어진 언어
* 선택자 학습 사이트 [http://flukeout.github.io/](http://flukeout.github.io/)
1. 기본형식   

		선택자{
		적용할 style명 : 속성값;
		}
	-	태그 선택자 : 특정 태그에 스타일을 주고자 할 때 사용하는 선택자
	-	id : 하나의 요소 선택자
		#(샵)id명{
				
	-	class : 여러 개의 요소 선택자
		.(점)클래스명{
		}
	-	가상 선택자 

2. 적용하는 방법
	- 내부 스타일 : HTML 문서 안에 기술하는 형태 (내부스타일은 타 HTML page에 적용하지 못하는 단점)
	- 외부 스타일 : 별도의 CSS 파일을 생성하여 HTML 문서로 불러오는 경우 (다양한 page에 적용 가능)	


### JSP와 SERVLET
* 교재 p52

1. JSP : javaServer page의 약자
	- HTML 페이지 안에 JAVA 코드를 담아서 관리하는 페이지
	- JSP는 클래스를 만든 후에 실행을 하므로 속도가 다소 느림
<Br>
	[1] JSP 구성요소
		- 스크립트 구성요소
			- 표현식(Expression) :  웹에 변수나 값을 출력한다. 
			`<%= ~ %>`
			- 스크립트릿(Scriptlet) : 자바 코드를 실행하고 작성하는 영역 
			`<% ~ %>`
			- 선언부(Declaration) : 자바 메서드(함수)나 변수를 선언할 때 사용함. static 영역에 할당됨. 많이 사용되지는 않음.    
`<%! ~ %>`

		- 디렉티브(Directive) : 선언자, <%@ ~ %> , 주황색으로 표기됨.
			- JSP 페이지에 대한 정보를 지정/제공할 때 사용됨.
		- page : JSP 페이지에 대한 정보 제공, 생성하는 문서 타입,, 인코딩 등의 정보 포함 
		- include : JSP 페이지에서 사용할 태그 라이브러리를 지정한다.(=import)
		- taglib : JSP 페이지의 특정 영역에 다른 문서를 포함시킨다. 
<hr>

2. SERVLET
	- Java파일 안에 HTML 태그를 담아서 관리하는 클래스
	- JSP와 달리 바로 클래스로서 실행이 가능하므로 JSP보다 실행속도가 빠름.
	- 서블릿(Servlet) : 서블릿클래스로부터 만들어진 객체, 단, 모든 객체가 서블릿이 되는 것은 아니다.   
	 <br>	 
	 [1] 서블릿 규약서 : 서블릿 클래스로부터 서블릿을 생성하는 규칙 
		- 임의의 클래스를 생성한 후, **HttpServlet 클래스를 상속받아 구현한다.**
		- doGet( )와 dePost( ) 메서드를 재정의(Override)한다.
		- 서버에 매핑(Mapping, 사상 또는 등록) 한다. 

3. Container : Component가 실행되는 환경 (Web의 Infra와 같은 개념)	
	* infra를 구성하는 기술들을 제공, 프로그램을 실행하는데 필요한 모든 것을 제공한다. 

4. Component : 일반적으로 Java Beans를 뜻함. 즉, Model(DTO, VO) 개념
	* 모듈(Module) : 독립적인 업무를 처리하고 다른 프로그램에서도 재사용이 가능한 프로그램 덩어리
		* 예) 로그인, 회원가입, 게시판, 장바구니 등 
<hr>

5. Web.XML : 배포(배치), 관리자(서술자, 설명자) : Development Descriptor
	* web application에 대한 여러가지 설정을 해주는 xml기반의 파일 (예_서블릿 규약서)
	* 서블릿(Servlet) 등록 / 클라이언트 매핑(Mapping, URL pattern)
	* 초기 파라미터 설정
	* 보안 설정
	* 모든 web application은 반드시 하나의 web.xml을 가져야 한다.
	* 위치 : WebContent - WEB-IBF 폴 더 안에 있으며, 
	* web.xml 파일의 설정들은 web application이 시작 시, 메모리에 로딩된다. 
	* 수정을 할 경우, web app을 재시작 해야 한다. (시작할 때 로딩 되므로)

	1. Web.xml 작성 주의사항
		- 대, 소문자 구분(기존 jsp, servlet엔 구분 없음)
		- attribute(속성) 값은 반드시 " " 또는  ' '로 감싸야 한다.
		- 태그는 반드시 닫아야 한다. 

	2. 서블릿 매핑하는 방법
		- 클라이언트의 요청 URL과 그 요청에 맞게 동작할 서블릿 객체를 연결하는 설정을 서블릿 매핑이라고 한다.
		-  패턴을 기술하는 방법
			1) 이름까지 정확하게 일치하도록 설정
				`<url-pattern>/[경로]/이름</url-pattern>`
			2) 디렉토리까지 일치하도록 설정
				`<url-pattern>/[경로]/*</url-pattern>`
			3) 확장자만 일치하도록 설정
				`<url-pattern>/[경로]/*.확장자</url-pattern>`
				

 서블릿을 등록하는 영역 || 서버와 클라이언트 양 쪽에 똑!같!이 등록해야함.

	<!-- 서버에 등록하는 작업 -->
	<servlet>
		<servlet-name>Greeting</servlet-name>
		<!-- 서블릿으로 사용될 클래스 이름을 등록한다. -->
		<servlet-class>tutorial_01.HelloWorld</servlet-class>  
	</servlet>

	<!-- Client에 등록하는 작업 -->
	<servlet-mapping>
		<servlet-name>Greeting</servlet-name>
		<!-- http://www.naver.com/hi → 여기서 hi가 url임.  -->
		<!-- Client가 웹서버를 호출할 때, 가장 먼저 web xml이 불려가고 그때 url 매핑을 보고 서버에다가 해당 서버릿을 가져오라고 명령함 -->
		<url-pattern>/hi</url-pattern>
	</servlet-mapping>

<hr>

6. Servlet LifeCycle
	* 관계도
		* Servlet<interface`> ← GernericServlet ← HttpServlet ← 사용자에 의해 생성된 서블릿 클래스
		* 우리가 주로 사용하는 HttpServlet은 인터페이스를 통해 상속 받는다. 
	
	[1]주요 메서드
		- init( ) : 서블릿 객체 생성된 이후, 초기화하는 역할
		- service( ) → doGet( ) / doPost( )로 오버라이딩 해서 주로 사용함 : 클라이언트의 요청이 들어오면 실행된다. 
			- 클라이언트의 요청(get 이냐 post냐)에 따라서 실행되게끔 2개의 메소드로 구성한다.
		- destroy( ) : 서블릿이 소멸되기 직전에 호출된다. 
<hr>

7. Request / Response
	1. Request
		* javax.servlet.http.HttpServletRequest
		* 클라이언트의 요청과 관련된 정보, 동작을 가지고 있는 객체이다.
		* 주요 기능 : 요청 파라미터 조회, HttpSession 객체 조회, Request Scope 내의 component 간의 데이터 공유 지원
			* Request Scope : Request 정보를 유지하는 범위, Response되기 전까지의 범위를 일컫음. (사용자가 요청한 것에 대한 Response를 하게 되면 그 전에 정보를 유지할 필요가 일반적으로는 없기 때문에)

	2. Response
		* javax.servlet.http.HttpServletResponse
		* 클라이언트의 요청을 받은 서버가 응답할 클라이언트의 정보와 동작을 가지고 있는 객체
		* 전달 방법
			* sendRedirect / RequestDispatcher(=forward) 방식에 의해 전달한다.
			* send Redirect : 페이지만 넘어갈 때 주로 사용, 제어권도 다 넘어감.
			* RequestDispatcher(forward) : 특정 변수, 값 등을 다른 페이지로 전달할 때 사용. 제어권은 dispatcher가 가지고 있는데 실행은 다른 애한테 시키는 역할

	3. Attribute Scope : 데이터 공유
		* 종류
			 * page Scope : 동일한 페이지만 데이터를 공유한다.
			 * request Scope : 위에 서술
			 * Session Scope : 로그인에서 로그아웃까지 데이터를 공유한다
			 * application scope : 서버를 닫을 때까지 데이터를 공유한다.
	 ```
	공유범위.setAtrribute("이름", "값");   
	getAttribute("이름");
	 ```

<hr>

8. HTML 입력 관련 태그들
	1. form tag: 입력 태그들을 묶어주는 태그
		* 속성
			* action : 요청한 URL, 폼태그가 가지고 있는 입력값들을 전달하는 곳
			* method : 전송 방법, 생략하면 get 방식
			* name : form에 이름을 붙이는 것

	2. Select, textarea, input tag
		* 공통 속성
			* name : 변수명
		* Select : value List에서 하나를 선택하는 tag
			* multiple : 다중 선택 
			* option : 항목(value, item)
		* textarea : 긴 문장을 입력 받을 때 사용하는 태그
			* cols : 열수
			* rows : 행수

	3. input의 type
		* text : 한 줄을 입력한다
		* password : 암호 입력(입력 시, *로 표기)
		* checkbox : 체크할 수 있는 박스(복수 선택)
		* radio : 단수 선택
		* file : 파일 선택
		* reset
		* submit
		* button : onclick 속성을 추가 기술하면 클릭 후 액션을 정할 수 있음
		* table : 표를 만드는 태그
			* <tr.> : 행을 묶을 때
			* <td.> : 열, 셀
<hr>

9. 초기 파라미터 설정
	* 서버단 컴포넌트(Servlet, JSP, Listener 등)에 사용하는 문자열 중 자주 사용되는 문자열을 web.xml에 등록해 놓고 컴포넌트에서 호출하여 사용하는 기능

	1. ServletContext
		* web app 내에서 모든 컴포넌트에 사용할 수 있도록 지정하는 파라미터
	
	2. ServletConfig
		* 특정 컴포넌트에서만 사용할 수 있도록 지정한 파라미터
	3. 설정하는 방법 : web.xml 에다가 아래와 같이 적용함
	

#예시

	<web app>
	# 모든 컴포넌트가 사용할 수 있는 초기 파라미터 설정
	<context-param>
		<init-param>
			<param-name> 파라미터명 </param-name>
			<param-value> 파리미터값 </param-value>
		</init-param>
	</context-param>
	# 특정 컴포넌트 생성 : 서블릿 객체 생성
	<servlet>
		<init-param>
			<param-name> 파라미터명 </param-name>
			<param-value> 파리미터값 </param-value>
		</init-param>
	</servlet>
	<servlet-mapping>
	# 클라이언트 영역
	</servlet-mapping>
	</web app>

<hr>
10. Event 모델
	 1. Event or Action : 컴포넌트에 가해진 행위, 그 행위에 의한 동작 또는 변화
	예) 버튼을 클릭하면 "안녕"이라는 글자가 출력된다.
		- Event Source : 버튼, 이벤트 객체
		- Event : 클릭, 액션
		- Event Handler : "안녕"이라는 글자를 출력하는 메서드

	2. Container
		* 컴포넌트에서 Event가 발생하는 것을 감시하는 객체 

	3. Listener Class
		* 발생한 Event를 처리하는 동작을 가지고 있는 객체
<hr>
11. Attribute(속성)
* Web app을 구성하는 컴포넌트(Servlet,JSP, Listener 등)에 공유하는 객체

	1. Scope : 데이터가 공유 범위/영역
		- Attribute들을 공유하기 위한 공유 장소의 영역(저장장소)
		- 공유 범위에 따라 세 가지로 구분한다.
		- page
			- request scope : HttpServletRequest 객체를 이용, 요청에서 응답까지만 공유
			- session scope : HttpSession 객체를 이용, 한 명의 클라이언트가 로그인해서 로그아웃까지 공유
			- application scope : ServletContext 객체를 이용, 서버를 닫을 때까지 공유

	2. 관련 메서드
	- Attribute 데이터는 Key, value가 쌍이 되어 저장한다.
	- setAttribute("name = key", Object value) : 공유 영역에 Attribute를 저장 
		- 여기서 Object로 value를 받는 것은 객체로 value를 받아서 원하는 dtype으로 변환해서 쓰면 되기 때문.
	- getAttribute("name = key") : Object value, 저장된 Attribute를 조회/호출
	- getAttributeNames( ) : Attribute에 저장된 name들만 조회/호출 
<hr>

12. Session 관리
* Http 프로토콜은 Stateless 한 특징을 가진다.
* State + less : 상태를 유지하지 못한다. 즉 클라이언트 데이터를 유지하지  못한다.

	1. Session
		- 하나의 클라이언트가 프로그램을 시작해서 종료할 때까지 데이터를 유지
		- 하나의 세션이 활동하는 기간동안 여러 번 요청과 응답을 할 수 있다.
		- 즉, 하나의 세션이 생성되면 세션 종료 전까지 클라이언트의 데이터는 유지된다.
		- 로그인~ 로그아웃까지 유지된다고 보면 됨.
		- 클라이언트의 요청에 따라 서버에 전송하는 데이터
		- 구문 : HttpSession 객체를 이용한다.
			> HttpServletRequest객체.getSession( ) : 기존의 세션이 있다면 기존 Session을,   
		   객체가 없다면 새로운 Session객체를 생성해서 리턴시켜준다. 
	   - 주요 메서드
			``session객체.setAttribute("name", "value");``
			``session객체.getAttribute("name");``  
			``session객체.removeAttribute("name");``  
			``session객체.invalidate( );  // 세션객체를 소멸시킨다.``   
			
	2. Cookie
		- 서버가 생성해서 클라이언트 PC로 전송하는 Text 타입(String)의 데이터(4킬로바이트)
		- 쿠키는 클라이언트의 정보를 유지하기 위한 데이터로 web browser에 저장된다.
		- 즉, 클라이언트의 영역에 저장된다.
		- 장점 : 서버의 과부하를 줄일 수 있다.
		- 단점 : 보안 취약하다. 관리할 수 있는 데이터의 크기와 종류가 제한된다.
		- 구문
			```
			Cookie c = new Cookie("name", "value");
			response.addCookie(c);
			request.getCookies(c);
				
			Cookie[] cs = request.getCookie( );
			```

		- 주요 메서드
			- getName( ) : String, Cookie의 name 추출
			- getValue( ) : String, Cookie의 value 추출
			- setMaxAge(int second) : second(초)가 양수이면 지정한 시간동안 유지되고, 음수이면 브라우저를 닫으면 사라진다. 
