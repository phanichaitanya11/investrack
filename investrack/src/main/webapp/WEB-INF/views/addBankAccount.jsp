<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<%@include file="include.jsp"%>
</head>
<body data-open="click" data-menu="vertical-menu" data-col="2-columns" class="vertical-layout vertical-menu 2-columns  fixed-navbar">
    
    <%@include file="frameTop.jsp"%>
    <%@include file="frameLeft.jsp"%>    
    
	<div class="app-content content container-fluid">
		<div class="content-wrapper">
        	<div class="content-header row">
          		<div class="content-header-left col-md-6 col-xs-12 mb-1">
            		<h2 class="content-header-title">Bank Accounts</h2>
          		</div>
        	</div>
        
			<div class="content-body">
				<section id="basic-form-layouts">
					<div class="row match-height">
						<div class="col-md-12">
							<div class="card">
								<div class="card-header">
									<h4 class="card-title" id="basic-layout-form">New Bank Account Details</h4>
								</div>
								<div class="card-body collapse in">
									<div class="card-block">
										<div class="card-text">
											<p>Enter the following details to add a new bank account to your profile.</p>
										</div>
										<form:form class="form" method="POST" name="addBankAcntDetailsForm" id="addBankAcntDetailsForm" action="addBankAccount" modelAttribute="bankAcntDetailsForm">
											<div class="form-body">
												<h4 class="form-section"><i class="icon-bank"></i>Bank Account Details</h4>
												<c:choose>
													<c:when test="${result == null }">
														<div class="row">
															<div class="col-md-6">
																<div class="form-group">
																	<label for="primaryHolderName">Primary Account Holder Name</label>
																	<form:input path="primaryHolderName" id="primaryHolderName" name="primaryHolderName" class="form-control" placeholder="Primary Account Holder name" />
																</div>
															</div>
														</div>
														<div class="row">
															<div class="col-md-6">
																<div class="form-group">
																	<label for="accountNumber">Account Number</label>
																	<form:input path="accountNumber" id="accountNumber" name="accountNumber" class="form-control" placeholder="Account Number" />
																</div>
															</div>
															<div class="col-md-6">
																<div class="form-group">
																	<label for="bankName">Bank Name</label>
																	<form:input path="bankName" id="bankName" name="bankName" class="form-control" placeholder="Bank Name" />
																</div>
															</div>
														</div>
														<div class="row">
															<div class="col-md-6">
																<div class="form-group">
																	<label for="branchName">Branch Name</label>
																	<form:input path="branchName" id="branchName" name="branchName" class="form-control" placeholder="Branch Name" />
																</div>
															</div>
															<div class="col-md-6">
																<div class="form-group">
																	<label for="IfscCode">IFSC Code</label>
																	<form:input path="IfscCode" id="IfscCode" name="IfscCode" class="form-control" placeholder="IFSC Code" />
																</div>
															</div>
														</div>
														<div class="row">
															<div class="col-md-6">
																<div class="form-group">
																	<label for="jointAcnt">Is this is a joint account?</label>
																	<form:select path="jointAcnt" id="jointAcntDrpDwn" name="jointAcntDrpDwn">
						                                    			<form:option value="0">No</form:option>
						                                    			<form:option value="1">Yes</form:option>
						                                    		</form:select>
						                                        </div>
						                                	</div>
														</div>
														<div class="row" id="secondaryHolderNameDiv" style="display:none">
															<div class="col-md-6">
																<div class="form-group">
																	<label for="secondaryHolderName">Secondary Account Holder Name</label>
																	<form:input path="secondaryHolderName" id="secondaryHolderName" name="secondaryHolderName" class="form-control" placeholder="Secondary Account Holder name" />
																</div>
															</div>
														</div>
														<div class="row">
															<div class="col-md-12">
																<div class="form-group">
																	<form:button class="btn btn-primary btn-min-width mr-1 mb-1">Submit</form:button>
																</div>
															</div>
														</div>
													</c:when>
													<c:otherwise>
														<c:if test="${result == 'success'}">
															<div class="col-md-6 alert alert-success no-border mb-2" role="alert">${msg}</div>
														</c:if>
														<c:if test="${result == 'error' }">
															<div class="col-md-6 alert alert-danger no-border mb-2" role="alert">${msg}</div>
														</c:if>
													</c:otherwise>
												</c:choose>
											</div>
										</form:form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</section>
			</div>
		</div>
	</div>
    
    <footer class="footer footer-static footer-light navbar-border">
      <!-- <p class="clearfix text-muted text-sm-center mb-0 px-2"><span class="float-md-left d-xs-block d-md-inline-block">Copyright  &copy; 2017 <a href="https://themeforest.net/user/pixinvent/portfolio?ref=pixinvent" target="_blank" class="text-bold-800 grey darken-2">PIXINVENT </a>, All rights reserved. </span><span class="float-md-right d-xs-block d-md-inline-block">Hand-crafted & Made with <i class="icon-heart5 pink"></i></span></p> -->
    </footer>
	<%@include file="frameBottom.jsp"%>
</body>
<script>
$(document).ready(function() {
	$('#jointAcntDrpDwn').change(function() {
		var isJointAcnt = this.value;
		if (isJointAcnt == 1) {
			$("#secondaryHolderNameDiv").show();
		} else if (isJointAcnt == 0) {
			$("#secondaryHolderNameDiv").hide();
		}
	});
});
</script>
</html>