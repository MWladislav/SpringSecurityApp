<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Online Library</title>
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${contextPath}/resources/css/index.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href=""><i class="fas fa-book-open"></i> L<i class="fas fa-info-circle"></i>brary</a>
        </div>
        <div class="navbar-collapse collapse" id="navbarToggler">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="https://vk.com/id138208938"><i class="fab fa-vk fa-2x"></i></a></li>
                <li><a href="https://www.youtube.com/watch?v=46q2eB7xvXA"><i class="fab fa-youtube fa-2x"></i></a></li>
                <li>
                    <form class="navbar-form ">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn">Search</button>
                    </form>
                </li>
                <li>
                    <form id="LogForm" class="navbar-form" action="">
                        <button class="btn-link" href="/login">Log In</button>
                    </form>
                </li>
                <li>
                    <form id="SignForm" class="navbar-form" action="">
                        <button class="btn btn-sm" href="/registration">Sign Up</button>
                    </form>

                </li>
            </ul>

        </div>
    </div>
</div>





<script defer src="https://use.fontawesome.com/releases/v5.1.0/js/all.js" integrity="sha384-3LK/3kTpDE/Pkp8gTNp2gR/2gOiwQ6QaO7Td0zV76UFJVhqLl4Vl3KL1We6q6wR9" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
