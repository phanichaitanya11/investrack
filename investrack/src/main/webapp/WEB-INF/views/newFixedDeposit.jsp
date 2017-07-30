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
            		<h2 class="content-header-title">Fixed Deposits</h2>
          		</div>
        	</div>
        
			<div class="content-body">
				<section id="basic-form-layouts">
					<div class="row match-height">
						<div class="col-md-12">
							<div class="card">
								<div class="card-header">
									<h4 class="card-title" id="basic-layout-form">New Deposit</h4>
								</div>
								<div class="card-body collapse in">
									<div class="card-block">
										<div class="card-text">
											<p>Enter the following details to add a new deposit.</p>
										</div>
										<form:form class="form" method="POST" name="addFDForm" id="addFDForm" action="addFD" modelAttribute="newFDForm">
											<div class="form-body">
												<h4 class="form-section"><i class="icon-head"></i> Personal Info</h4>
												<div class="row">
													<div class="col-md-6">
														<div class="form-group">
															<label for="firstName">First Name</label>
															<form:input path="primaryHolder.firstName" id="firstName" name="firstName" class="form-control" placeholder="First Name" />
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<label for="lastName">Last Name</label>
															<form:input path="primaryHolder.lastName" id="lastName" name="lastName" class="form-control" placeholder="Last Name" />
														</div>
													</div>
												</div>
												<div class="row">
													<div class="col-md-6">
														<div class="form-group">
															<label for="emailId">E-mail</label>
															<form:input path="primaryHolder.emailId" id="emailId" name="emailId" class="form-control" placeholder="Email Id" />
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<label for="mobileNum">Contact Number</label>
															<form:input path="primaryHolder.mobileNum" id="mobileNum" name="mobileNum" class="form-control" placeholder="Contact Number" />
														</div>
													</div>
												</div>
				
												<h4 class="form-section"><i class="icon-bank"></i>Bank Details</h4>
												<br>
												
												<h4 class="form-section"><i class="icon-money1"></i>Deposit Details</h4>
												<div class="row">
													<div class="col-md-3">
														<div class="form-group">
															<label for="depositAmt">Deposit Amount (Rs.)</label>
															<form:input path="depositAmount" id="depositAmt" name="depositAmt" class="form-control" placeholder="Deposit Amount" />
														</div>
													</div>
													<div class="col-md-3">
														<div class="form-group">
															<label for="rateOfInterest">Rate Of Interest (%)</label>
															<form:input path="rateOfInterest" id="rateOfInterest" name="rateOfInterest" class="form-control" placeholder="Rate of Interest" />
														</div>
													</div>
													<div class="col-md-3">
														<div class="form-group">
															<label for="compoundedInterestFreq">Compounded Interest Frequency</label>
															<form:select id="compoundedInterestFreq" path="compoundedInterestFreq" name="compoundedInterestFreq" class="form-control" data-toggle="tooltip" data-trigger="hover" data-placement="top" data-title="Compounded Interest Frequency">
																<option value="1">Yearly</option>
																<option value="2">Half-Yearly</option>
																<option value="4">Quaterly</option>
																<option value="12">Monthly</option>
															</form:select>
														</div>
													</div>
												</div>
												<div class="row">
													<div class="col-md-3">
														<div class="form-group">
															<label for="startDt">Start Date</label>
															<form:input type="date" path="startDate" id="startDt" name="startDt" class="form-control" data-toggle="tooltip" data-trigger="hover" data-placement="top" data-title="Start Date"/>
														</div>
													</div>
													<div class="col-md-3">
														<div class="form-group">
															<label for="maturityDt">Maturity Date</label>
															<form:input type="date" path="maturityDate" id="maturityDt" name="maturityDt" class="form-control" data-toggle="tooltip" data-trigger="hover" data-placement="top" data-title="Maturity Date"/>
														</div>
													</div>
												</div>
												<div class="row">
													<div class="col-md-3">
														<div class="form-group">
															<label for="startDt">Tenure</label>
															<input type="text" id="tenure" name="tenure" class="form-control" placeholder="Tenure" />
														</div>
													</div>
													<div class="col-md-3">
														<div class="form-group">
															<label>&nbsp;</label>
															<select id="tenurePeriodFreq" name="tenurePeriodFreq" class="form-control" data-toggle="tooltip" data-trigger="hover" data-placement="top" data-title="Tenure period">
																<option value="356">Day(s)</option>
																<option value="12">Month(s)</option>
																<option value="1">Year(s)</option>
															</select>
														</div>
													</div>
												</div>
												<div class="row">
													<div class="col-md-3">
														<button type="button" class="btn btn-primary" id="calMaturityAmt">
															Calculate Maturity Amount
														</button>
													</div>
												</div>
												<br>
												<div class="row" id="maturityAmtDiv" style="display: none;">
													<div class="col-md-12">
														<div class="form-group">
															<label for="amountInvsted" class="card-subtitle col-sm-2 control-label"><h5>Amount Invested: </h5></label>
															<div class="col-sm-5">
																<h5><label id="amountInvsted" class="control-label"></label></h5>
															</div>
														</div>
													</div>
													<div class="col-md-12">
														<div class="form-group">
															<label for="maturityAmt" class="card-subtitle col-sm-2 control-label"><h5>Maturity Amount : </h5></label>
															<div class="col-sm-5">
																<h5><label id="maturityAmt" class="control-label"></label></h5>
															</div>
														</div>
													</div>
													<div class="col-md-12">
														<div class="form-group">
															<label for="interestEarned" class="card-subtitle col-sm-2 control-label"><h5>Interest Earned : </h5></label>
															<div class="col-sm-5">
															  <h5><label id="interestEarned" class="control-label"></label></h5>
															</div>
														</div>
													</div>
												</div>
												
												
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
	$('#calMaturityAmt').click(function() {
		var i_Chars = ".";

		var principalVal = $('#depositAmt').val();
		if(principalVal == "" || isNaN(principalVal) || (parseFloat(principalVal) <= 0))
		{
			alert("Please enter Deposit Amount");
			$('#depositAmt').val("");
			$('#depositAmt').focus();
			return(false);
		}
		
		var interestVal = $('#rateOfInterest').val();
		if(interestVal == "" || isNaN(interestVal) || (parseFloat(interestVal) <= 0) || (parseFloat(interestVal) > 100))
		{
			alert("Please enter valid Rate of Interest");
			$('#rateOfInterest').val("");
			$('#rateOfInterest').focus();
			return false;
		}

		var tenureVal = $('#tenure').val();
		if(tenureVal == "" || isNaN(tenureVal) || (parseFloat(tenureVal) <= 0))
		{
			alert("Please enter Tenure");
			$('#tenure').val("");
			$('#tenure').focus();
			return false;
		}	
		
		for (var i = 0; i < tenureVal.length; i++)
		{
			if (i_Chars.indexOf(tenureVal.charAt(i)) != -1)
			{
				alert ("Please enter Tenure of deposit in numbers. No Decimals allowed");
				$('#tenure').val("");
				$('#tenure').focus();
				return false;
			}
		}

		var tenurePeriodVal = $('#tenurePeriodFreq').val();
		var frequencyVal = $('#compoundedInterestFreq').val();

		//Get computable values
		principalVal = parseFloat(principalVal);
		interestVal = parseFloat(interestVal);
		tenureVal = parseFloat(tenureVal);
		tenurePeriodVal = parseFloat(tenurePeriodVal);
		frequencyVal = parseFloat(frequencyVal);

		var retStr = calMatVal(principalVal, interestVal, tenureVal, tenurePeriodVal, frequencyVal);

		$('#amountInvsted').html("Rs. " + principalVal + "/-");
		$('#maturityAmt').html("Rs. " + retStr + "/-");
		$('#interestEarned').html("Rs. " + (retStr - principalVal).toFixed(2) + "/-");
		$("#maturityAmtDiv").show();

		return(false);
	});

	function calMatVal(principalVal, interestVal, tenureVal, tenurePeriodVal, frequencyVal)
	{
		var fdMatVal=0;
		var retStr="";
		if(tenureVal <= 90 && tenurePeriodVal == 365)
		{
			frequencyVal = 0;
		}

		if(frequencyVal == 0)	//	Simple interest
		{
			fdMatVal = principalVal * (1 + ((interestVal * tenureVal) / (tenurePeriodVal*100)));
			//retStr = retStr + "Simple Interest = " +fdMatVal;
		}
	    else	//	Compound interest
		{
			var val1 = 1 + interestVal/(100 * frequencyVal);
			var val2 = (tenureVal * frequencyVal / tenurePeriodVal);
			var val3 = 0;

			val3 = Math.pow(val1, val2);
			fdMatVal = (principalVal * val3);
			//retStr = retStr + "Compund Interest = " +fdMatVal;
		}

	    retStr = retStr + fdMatVal.toFixed(2);
		return(retStr);
	}
});
</script>
</html>