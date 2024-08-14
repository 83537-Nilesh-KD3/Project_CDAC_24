// src/Centers.js
import React from "react";
import { useNavigate } from "react-router-dom";
import Navbar from "../navbar/navbar";

function Centers() {
  // Sample data for the centers
  const centers = [
    { id: 1, name: "Sunbeam Karad" },
    { id: 2, name: "Sunbeam Hinjewadi" },
    { id: 3, name: "CDAC- ACTS" },
    { id: 4, name: "IACSD" },
    { id: 5, name: "KNOW-IT" },
  ];

  const handleBack = () => {
    navigate("/registration");
    console.log("Next button clicked");
  };

  const handleNext = () => {
    navigate("/seatallotment");

    console.log("Back button clicked");
  };

  const navigate = useNavigate();

  const tableStyle = {
    width: "80%",
    maxWidth: "600px",
    margin: "20px auto",
    borderCollapse: "collapse",
  };

  const thTdStyle = {
    padding: "8px 12px",
    border: "1px solid #ccc",
    textAlign: "left",
  };

  return (
    <div>
      <Navbar />
      <h1 style={{ textAlign: "center" }}>Choose Center</h1>
      <table style={tableStyle}>
        <thead>
          <tr>
            <th style={thTdStyle}>Center ID</th>
            <th style={thTdStyle}>Center Name</th>
            <th style={thTdStyle}>Select</th>
          </tr>
        </thead>
        <tbody>
          {centers.map((center) => (
            <tr key={center.id}>
              <td style={thTdStyle}>{center.id}</td>
              <td style={thTdStyle}>{center.name}</td>
              <td style={thTdStyle}>
                <input type="checkbox" />
              </td>
            </tr>
          ))}
        </tbody>
      </table>

      <button type="button" onClick={handleNext}>
        Next
      </button>
      <button type="button" onClick={handleBack}>
        Back
      </button>
    </div>
  );
}

export default Centers;
