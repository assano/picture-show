<!DOCTYPE html>

<head>
	<meta charset="UTF-8">
	<title>照片墙</title>

</head>
<body>

	<br /><br />
	<hr />
	<#if pictures??>
		<#list pictures as pic>
			<h3 align="center">${pic.pictureName}</h3>
			<div align="center">
				<img src="${pic.largePicturePath}" align="center" />
			</div>
			<br />
		</#list>
	<#else>
		<div align="center">
			没有任何照片，请上传
		</div>
	</#if>

</body>
</html>