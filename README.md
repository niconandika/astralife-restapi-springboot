# astralife RestApi
<h1>How to run</h1>
<ul>
  <li>Download File</li>
  <li>Open Project di IDE (intellij atau Spring Tool Suite)</li>
  <li>Run App</li>
</ul>
<br>
<h2>Test Using POSTMAN POST</h2>
<ul>
  <li>POST</li>
  <li>url : http://localhost:8080/employee</li>
  <li>header 'Content-Type: application/json'</li>
  <li>body 'raw'</li>
  <li>
    {<br>
        "nik": "EM00001",<br>
        "name": "Matt",<br>
        "type": "PROMOTION",<br>
        "positionId": "2",<br>
        "divisionId": "3",<br>
        "lastPosition": "Supervisor"<br>
      }
  </li>
  <li>&nbsp;</li>
  <li>code curl</li>
  <li>
    curl --location --request POST 'http://localhost:8080/employee' \ <br>
    --header 'Content-Type: application/json' \ <br>
    --data-raw '{ <br>
        "nik": "EM00001", <br>
        "name": "Matt", <br>
        "type": "PROMOTION", <br>
        "positionId": "2", <br>
        "divisionId": "3", <br>
        "lastPosition": "Supervisor" <br>
    }'
  </li>
</ul>
<br>
<h2>Test Using POSTMAN GET</h2>
<ul>
  <li>GET</li>
  <li>url : http://localhost:8080/employee</li>
</ul>
<ul>
  <li>GET BY ID</li>
  <li>url : http://localhost:8080/employee/1</li>
  <li>&nbsp;</li>
  <li>code curl</li>
  <li>curl --location --request GET 'http://localhost:8080/employee/1'</li>
</ul>
<br>
<h2>Test Using POSTMAN PUT</h2>
<ul>
  <li>PUT</li>
  <li>url : http://localhost:8080/employee/1</li>
  <li>&nbsp;</li>
  <li>code curl</li>
  <li>
    curl --location --request PUT 'http://localhost:8080/employee/1' \<br>
      --header 'Content-Type: application/json' \<br>
      --data-raw '{<br>
          "nik": "EM00002",<br>
          "name": "Jhonson",<br>
          "type": "PROMOTION",<br>
          "positionId": "2",<br>
          "divisionId": "3",<br>
          "lastPosition": "Supervisor"<br>
      }'
  </li>
</ul>

<br>
<h2>Test Using POSTMAN DELETE</h2>
<ul>
  <li>DELETE</li>
  <li>url : http://localhost:8080/employee/1</li>
  <li>&nbsp;</li>
  <li>code curl</li>
  <li>curl --location --request DELETE 'http://localhost:8080/employee/1'</li>
</ul>








