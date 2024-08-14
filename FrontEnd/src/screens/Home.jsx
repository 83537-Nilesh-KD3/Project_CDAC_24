import React from "react";
import Navbar from "../navbar/navbar";
import RegistrationForm from "./RegistrationPage";

function Home() {
  return (
    <div style={{ textAlign: "center", fontWeight: "bold" }}>
      <Navbar />
      <h2> Welcome to CDAC </h2>
      <RegistrationForm />
    </div>
  );
}

export default Home;
