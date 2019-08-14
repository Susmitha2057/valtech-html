<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>ADMIN PAGE</title>
    <style>
        body {
            text-align: center;
            background-color: aliceblue;
        }

        #btn {
            padding: 10px;
            margin: 15px;
            width: 400px;
            height: 50px;
            background-color: aquamarine;
            color: darkblue;
            font-size: 22px;
        }

        #btn:hover {
            background-color: cornflowerblue;
        }
    </style>
</head>

<body>
		<form action="viewLogs" method="post">
        <button id="btn" type="submit" onclick="location.href='viewLogs'">VIEW LOGS</button><br>
        </form>
        <form action="adminLogout" method="post">
        <button id="btn" onclick="location.href='HomePage'">LOGOUT</button><br>
        </form>
</body>

</html>