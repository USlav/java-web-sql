document
  .getElementById("data-form")
  .addEventListener("submit", async function (event) {
    event.preventDefault();
    const dataInput = document.getElementById("data-input").value;
    const response = await fetch("http://localhost:8080/api/data", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ data: dataInput }),
    });
    const result = await response.json();
    console.log(result);
  });
