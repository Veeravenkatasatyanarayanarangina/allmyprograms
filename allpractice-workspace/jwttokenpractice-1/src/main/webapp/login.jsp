<!DOCTYPE html>
<html>
    <head>

    </head>
    <style>
        .header{
    text-align: center;
}
.login-page {
    width: 360px;
    padding: 6% 0 0;
    margin: auto;
}
.form {
    position: relative;
    z-index: 1;
    background: #FFFFFF;
    max-width: 80%;
    margin: 0 auto 100px;
    padding: 45px;
    text-align: center;
    border-radius: 5px;
    box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
 }
       .form input {
    font-family: "Roboto", sans-serif;
    outline: 0;
    background: #f2f2f2;
    width: 100%;
    border: 0;
    margin: 0 0 15px;
    padding: 7px;
    box-sizing: border-box;
    border-radius: 5px;
    font-size: 14px;
}
.form select {
    font-family: "Roboto", sans-serif;
    outline: 0;
    background: #f2f2f2;
    width: 100%;
    border: 0;
    margin: 0 0 15px;
    padding: 7px;
    box-sizing: border-box;
    border-radius: 5px;
    font-size: 14px;
}
.form button {
    font-family: "Roboto", sans-serif;
    text-transform: uppercase;
    outline: 0;
    background-color: #328f8a;
    background-image: linear-gradient(45deg,#328f8a,#08ac4b);
    border-radius: 5px;
    width: 100%;
    border: 0;
    padding: 7px;
    color: #FFFFFF;
    font-size: 14px;
    -webkit-transition: all 0.3 ease;
    transition: all 0.3 ease;
    cursor: pointer;
}
    </style>
    <body>
        <div class="container">
            <div class="header">
            </div>
                <div class="login-page">
                    <div class="form">
                      <div class="login">
                        <div class="login-header">
                          <h3>security login</h3>
                        </div>
                      </div>
                      <form class="form-signin" method="post" action="checklogin">
          <input type="text" id="username" name="username" class="form-control" 
          placeholder="Username" required="" autofocus="">
          <input type="password" id="password" name="password" class="form-control" 
          placeholder="Password" required="">
        <button class="btn btn-lg btn-primary btn-block" type="submit">login in</button>
      </form>
                    </div>
                  </div>
            </div>
        </div>
    </body>
</html>

