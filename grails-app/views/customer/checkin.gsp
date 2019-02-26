<!doctype html>
<html>

<head>
	<title>Kiosk</title>

	%{--<link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.min.css')}" type="text/css">--}%
	<asset:stylesheet src="bootstrap.min.css"/>

	<script src="js/respond.js"></script>

</head>

<body>
	<g:form url="[resource:customerInstance, action:'customerLookup']" >
			<g:render template="kioskFormFinal"/>
	</g:form>
	
	
	%{--<g:javascript library="jquery"/>--}%
	%{--<script src="js/bootstrap.min.js"></script>--}%

	<asset:javascript src="bootstrap.min.js"/>
</body>
</html>