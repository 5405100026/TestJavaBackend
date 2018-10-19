# TestJavaBackend

## request for register 
 http://localhost:8080/register
## example data for register
 {
 "username":"attapong",
 "password":"123456",
 "address":"81 dindang dindang bangkok 10400",
 "phone":"660871458796",
 "salary":"15000"
 }
 
## you will retrieve Token 
## example token
  eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhdHRhcG9uZyJ9.L3dt5trvEONJviCtpKHglaAjNVOgrOz9Y6Ko2dhNLYBwBZ1J0gmJthzsQjIER0LOTkZPYe_IXoNkERRqwYW5iA
 

### requst for get infomation
http://localhost:8080/getMembers

### you can token put to header with key Authorisation
## Example 
token eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhdHRhcG9uZyJ9.L3dt5trvEONJviCtpKHglaAjNVOgrOz9Y6Ko2dhNLYBwBZ1J0gmJthzsQjIER0LOTkZPYe_IXoNkERRqwYW5iA

## you will retrive info 
 {
 "username":"attapong",
 "password":"123456",
 "address":"81 dindang dindang bangkok 10400",
 "phone":"660871458796",
 "salary":"15000"
 }

## incorrent token you retrive info 

{
    "timestamp": "2018-10-19T03:52:04.623+0000",
    "status": 500,
    "error": "Internal Server Error",
    "message": "JWT Token is incorrect",
    "path": "/api/getMembers/"
}
