<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap/bootstrap.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body background="${pageContext.request.contextPath }/images/www.jpg">
<!-- 	<div> -->
<!-- 		<h1>Login Page</h1> -->
<!-- 	</div> -->
<!-- 	<form action="login.do" method="post"> -->
<!-- 		<fieldset> -->
<!-- 			<legend>Login</legend> -->
<!-- 			<table> -->
<!-- 				<tr> -->
<!-- 					<th>ID</th> -->
<!-- 					<td><input type="text" id="user_id" name="userId" -->
<!-- 						placeholder="ID를 입력해주세요"></td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<th>PW</th> -->
<!-- 					<td><input type="password" id="user_pw" name="pwd" -->
<!-- 						placeholder="비밀번호를 입력해주세요"></td> -->
<!-- 				</tr> -->
<!-- 			</table> -->
<!-- 			<br> -->
<!-- 			<div> -->
<!-- 				<button type="button" onclick="window.location.href='signUpPage.do'">회원가입</button> -->
<!-- 				<button type="submit">submit</button> -->
<!-- 				<button type="reset">reset</button> -->
<!-- 			</div> -->
<!-- 		</fieldset> -->
<!-- 	</form> -->

		
	   <div class="container">
      <form class="form-signin" action="login.do" method="post">
        <h2 class="form-signin-heading">Login</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input class="form-control" id="user_id" name="userId" placeholder="Email address" required autofocus>
        <input type="password" id="user_pw" name="pwd" class="form-control" placeholder="Password" required>
        
        
        
        <button class="btn btn-lg btn-primary btn-block" style="padding: .5rem 7.3rem;" type="submit">Sign in</button>
        <br>
        <button type="reset">reset</button>
        <button type="button" onclick="window.location.href='signUpPage.do'">회원가입</button>
      </form>
		</div>
		
</body>
<script>
//NOTICE!! DO NOT USE ANY OF THIS JAVASCRIPT
//IT'S JUST JUNK FOR OUR DOCS!
//++++++++++++++++++++++++++++++++++++++++++
/*!
* Copyright 2014 Twitter, Inc.
*
* Licensed under the Creative Commons Attribution 3.0 Unported License. For
* details, see http://creativecommons.org/licenses/by/3.0/.
*/
//Intended to prevent false-positive bug reports about Bootstrap not working properly in old versions of IE due to folks testing using IE's unreliable emulation modes.
(function () {
'use strict';

function emulatedIEMajorVersion() {
 var groups = /MSIE ([0-9.]+)/.exec(window.navigator.userAgent)
 if (groups === null) {
   return null
 }
 var ieVersionNum = parseInt(groups[1], 10)
 var ieMajorVersion = Math.floor(ieVersionNum)
 return ieMajorVersion
}

function actualNonEmulatedIEMajorVersion() {
 // Detects the actual version of IE in use, even if it's in an older-IE emulation mode.
 // IE JavaScript conditional compilation docs: http://msdn.microsoft.com/en-us/library/ie/121hztk3(v=vs.94).aspx
 // @cc_on docs: http://msdn.microsoft.com/en-us/library/ie/8ka90k2e(v=vs.94).aspx
 var jscriptVersion = new Function('/*@cc_on return @_jscript_version; @*/')() // jshint ignore:line
 if (jscriptVersion === undefined) {
   return 11 // IE11+ not in emulation mode
 }
 if (jscriptVersion < 9) {
   return 8 // IE8 (or lower; haven't tested on IE<8)
 }
 return jscriptVersion // IE9 or IE10 in any mode, or IE11 in non-IE11 mode
}

var ua = window.navigator.userAgent
if (ua.indexOf('Opera') > -1 || ua.indexOf('Presto') > -1) {
 return // Opera, which might pretend to be IE
}
var emulated = emulatedIEMajorVersion()
if (emulated === null) {
 return // Not IE
}
var nonEmulated = actualNonEmulatedIEMajorVersion()

if (emulated !== nonEmulated) {
 window.alert('WARNING: You appear to be using IE' + nonEmulated + ' in IE' + emulated + ' emulation mode.\nIE emulation modes can behave significantly differently from ACTUAL older versions of IE.\nPLEASE DON\'T FILE BOOTSTRAP BUGS based on testing in IE emulation modes!')
}
})();
</script>
<style>
body {
  padding-top: 40px;
  padding-bottom: 40px;
  background-color: #eee;
}

.form-signin {
  max-width: 330px;
  padding: 15px;
  margin: 0 auto;
  
  background:white;
  border-radius: 15px;
}
.form-signin .form-signin-heading,
.form-signin .checkbox {
  margin-bottom: 10px;
}
.form-signin .checkbox {
  font-weight: normal;
}
.form-signin .form-control {
  position: relative;
  height: auto;
  -webkit-box-sizing: border-box;
     -moz-box-sizing: border-box;
          box-sizing: border-box;
  padding: 10px;
  font-size: 16px;
}
.form-signin .form-control:focus {
  z-index: 2;
}
.form-signin input[type="email"] {
  margin-bottom: -1px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}
.form-signin input[type="password"] {
  margin-bottom: 10px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}	
</style>
</html>