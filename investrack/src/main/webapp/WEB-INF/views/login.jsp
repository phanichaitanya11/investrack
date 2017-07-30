<!DOCTYPE html>
<html lang="en" data-textdirection="ltr" class="loading">
<%@include file="include.jsp"%>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Page - Investments Tracking System</title>
  </head>
  <body data-open="click" data-menu="vertical-menu" data-col="1-column" class="vertical-layout vertical-menu 1-column  blank-page blank-page">
    <div class="app-content content container-fluid">
      <div class="content-wrapper">
        <div class="content-header row">
        </div>
        <div class="content-body"><section class="flexbox-container">
    <div class="col-md-4 offset-md-4 col-xs-10 offset-xs-1  box-shadow-2 p-0">
        <div class="card border-grey border-lighten-3 m-0">
            <div class="card-header no-border">
                <div class="card-title text-xs-center">
                    <div class="p-1"><img src="app-assets/images/logo/robust-logo-dark.png" alt="branding logo"></div>
                </div>
                <h6 class="card-subtitle line-on-side text-muted text-xs-center font-small-3 pt-2"><span>Login</span></h6>
            </div>
			<c:if test = "${result == 'error' }">
				<div>
					<div class="form-group has-success">
						<label class="col-sm-4 control-label" for="inputSuccess">${msg}</label>
					</div>
				</div>
			</c:if>
            <div class="card-body collapse in">
                <div class="card-block">
                    <form:form class="form-horizontal form-simple" name="loginForm" id="loginForm" method="POST" action="login" modelAttribute="loginForm" >
                        <fieldset class="form-group position-relative has-icon-left mb-0">
                        	<form:input id="username" path="username" name="username" class="form-control form-control-lg input-lg" placeholder="Your Username"/>
                            <div class="form-control-position">
                                <i class="icon-head"></i>
                            </div>
                        </fieldset>
                        <br/>
                        <fieldset class="form-group position-relative has-icon-left">
                        	<form:input type="password" id="password" path="password" name="password" class="form-control form-control-lg input-lg" placeholder="Enter Password"/>
                            <div class="form-control-position">
                                <i class="icon-key3"></i>
                            </div>
                        </fieldset>
                        <button type="submit" class="btn btn-primary btn-lg btn-block"><i class="icon-unlock2"></i> Login</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</section>

        </div>
      </div>
    </div>

    <%@include file="frameBottom.jsp"%>
  </body>
</html>
