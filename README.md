# LandingPage

This web starter template is based on Spring, SQLite. Check the following links for documentation and guides:

- [Spring](https://spring.io/projects/spring-boot)
- [SQLite](https://www.sqlite.org/index.html)


### Starting the backend server
Open the root folder and run
```
./gradlew bootRun
```


## Backend - API

### Employee Routes

| HTTP Method | HTTP Path | Action |
| ------------|-----------|--------|
| `GET`    | `/employees/list?queryList={employeeIDList}`                | return list of employees with matching employeeID. |
| `GET`    | `/users/{employeeID}` | return information about the employee with the matching employeeID|
| `GET`   | `/employees`      | return a list of all the employees.|

 
## Postman screenshots 

![Queried Employees](https://res.cloudinary.com/dlvwrtpzq/image/upload/v1625140554/queriedEmployees_bbtxbt.png "screenshot")

![All Employees](https://res.cloudinary.com/dlvwrtpzq/image/upload/v1625140554/all_employees_vpie00.png "screenshot")

![Queried Employees](https://res.cloudinary.com/dlvwrtpzq/image/upload/v1625140554/employeeById_zoyn6i.png "screenshot")
