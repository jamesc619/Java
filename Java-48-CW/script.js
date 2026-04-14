let data, info; // global variables

async function init(){  
  let link = "https://sturdy-invention-4jv74rpggp97f74p6-8500.app.github.dev";// Insert your Dev URL from Activity 47. The activity (DB server) must be running in a separate tab.
  let route= "/employees";
  
  // Problem 1: Add the link to your database server and the route above.
    info = await fetch(link+route);
    data = await info.json();

  // Problem 2: Write the JS code in the function init() and get the employee's table from your server as an array of JSON.
    console.log(data);

  // Problem 3: For each employee, display their first name, last name and birthdate to the console.
    for(let i=0; i<data.length; i++){
      let employee = data[i];
      console.log(employee.FirstName);
      console.log(employee.LastName);
      console.log(employee.BirthDate);
    }
  

  }