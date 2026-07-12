import React from "react";

function App() {

  const offices = [
    {
      id: 1,
      name: "Tech Park",
      rent: 55000,
      address: "Hyderabad",
      image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=600"
    },
    {
      id: 2,
      name: "Cyber Towers",
      rent: 75000,
      address: "Bengaluru",
      image: "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=600"
    },
    {
      id: 3,
      name: "Business Hub",
      rent: 65000,
      address: "Chennai",
      image: "https://images.unsplash.com/photo-1497366216548-37526070297c?w=600"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>

      <h1>Office Space Rental App</h1>

      {offices.map((office) => (
        <div
          key={office.id}
          style={{
            border: "1px solid gray",
            marginBottom: "20px",
            padding: "15px",
            width: "350px"
          }}
        >

          <img
            src={office.image}
            alt={office.name}
            width="300"
            height="200"
          />

          <h2>{office.name}</h2>

          <p>
            <strong>Rent : </strong>

            <span
              style={{
                color: office.rent < 60000 ? "red" : "green"
              }}
            >
              ₹{office.rent}
            </span>
          </p>

          <p>
            <strong>Address : </strong>
            {office.address}
          </p>

        </div>
      ))}

    </div>
  );
}

export default App;