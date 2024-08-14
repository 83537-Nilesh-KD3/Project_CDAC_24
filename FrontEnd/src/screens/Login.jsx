import React, { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import { toast } from "react-toastify";

function Login() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    if (email.length === 0) {
      toast.error("Enter E-mail");
    } else if (password.length === 0) {
      toast.error("Enter Password");
    } else {
      navigate("/home");
    }
  };

  return (
    // <div className="sign-in-container">
    <div className="sign-in-container">
      <center>
        <h2>Sign In</h2>
      </center>
      <form>
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
          Sign In
        </button>

        <div>
          <Link to="/signup">
            Signup Here
            {/* <button className='btn btn-success mt-2' > Signup Here</button> */}
          </Link>
        </div>
      </form>
    </div>
  );
}

export default Login;
