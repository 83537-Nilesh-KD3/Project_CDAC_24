import React, { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import { toast } from "react-toastify";
import "./Login.css";

function Signup() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [firstname, setFirstName] = useState("");
  const [lastname, setLastName] = useState("");

  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    if (firstname.length === 0) {
      toast.warn("Enter first name");
    } else if (lastname.length === 0) {
      toast.warn("Enter Last Name");
    } else if (email.length === 0) {
      toast.warn("Enter E-mail");
    } else if (password.length === 0) {
      toast.warn("Enter Password");
    } else {
      navigate("/login");
    }
  };

  return (
    <div className="sign-in-container">
      <center>
        <h2>Register</h2>
      </center>

      <form>
        <div className="form-group">
          <label htmlFor="password">First Name:</label>
          <input
            type="text"
            id="fname"
            value={firstname}
            onChange={(e) => setFirstName(e.target.value)}
            //  required
          />
        </div>
        <div className="form-group">
          <label htmlFor="password">Last Name:</label>
          <input
            type="text"
            id="fname"
            value={lastname}
            onChange={(e) => setLastName(e.target.value)}
            //  required
          />
        </div>
        <div className="form-group">
          <label htmlFor="email">Email:</label>
          <input
            type="email"
            id="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            //  required
          />
        </div>
        <div className="form-group">
          <label htmlFor="password">Password:</label>
          <input
            type="password"
            id="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            //  required
          />
        </div>

        <button type="submit" onClick={handleSubmit}>
          Register
        </button>

        <div>
          Already have a account?
          <Link to="/login">Login</Link>
        </div>
      </form>
    </div>
  );
}

export default Signup;
