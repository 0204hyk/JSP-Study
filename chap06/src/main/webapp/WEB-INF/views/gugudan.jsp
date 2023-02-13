<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>구구단</title>
    <style>
        #grid-container {
            box-sizing: border-box;
            width: 900px;
            height: 500px;
            display: grid;
            grid-template-columns: repeat(10, 1fr);
            grid-template-rows: repeat(8, 1fr);
            text-align: center;
        }

        .gop {
            background-color: rgb(180, 226, 226);
            border-radius: 15%;
            border: dashed 1px black;
            padding-top: 20px;
            margin: 1px;
        }

        .dan {
            border: dashed 1px black;
            border-radius: 15%;
            background-color: rgb(113, 142, 142);
            font-size: 25px;
            font-weight: bold;
            padding-top: 12.5px;
            margin: 1px;
        }
    </style>

</head>
<body>
	<h3>구구단</h3>
	
	<div id="grid-container"></div>
	
	<script>
        const gugudan = document.getElementById('grid-container');

        for (i = 2; i <= 9; ++i) {
            gugudan.innerHTML += '<div class=\'dan\'>' + i + '단</div>';

            for (j = 1; j <= 9; ++j) {
                gugudan.innerHTML += '<div class=\'gop\'>'+ i + 'x' + j + '=' + (i * j) +'</div>';
            }
        }

    </script>
	
	
</body>
</html>