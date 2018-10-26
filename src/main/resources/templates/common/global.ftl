<#assign contextPath=request.contextPath />
<#macro head title>
<!doctype html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="flybiner单点登入">
    <meta name="author" content="flybiner">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>${title}</title>
    <#--公共css-->
    <!-- Bootstrap core CSS -->
    <#--<link href="/static/bootstrap/bootstrap.min.css" rel="stylesheet">-->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <#nested>
</head>
</#macro>

<#macro body>
<body>
    <#nested>
</#macro>

<#macro end>
    <#--公共js-->
    <#nested>
</body>
</html>
</#macro>