<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>HOME PAGE</title>
    <style>
    body {
		background-image: url("C:/Users/susmitha.d/eclipse-workspace/MedicalManagement/images/homepage.jpg");
		text-align: center;
		background-size: 1300px 1000px;
		}
        h1,h2{
            color:blue;
            text-align:center;
        }
        .btn{
            background-color:cadetblue;
            text-align: center;
            padding: 10px;
            margin:5px;
        }
        .btn2{
            text-align: center;
        } 
    </style>
</head>
<body>
<h1>VIRTUAL MEDICAL HOME</h1><br>
<h2>CLICK HERE TO LOGIN</h2><br><div class="btn2">

<button class="btn" onclick="location.href='patient'">FOR PATIENT</button><br>
<button class="btn" onclick="location.href='doctor'">FOR DOCTOR</button><br>
<button class="btn" onclick="location.href='admin'">FOR ADMIN</button>
</div>
</body>
</html>