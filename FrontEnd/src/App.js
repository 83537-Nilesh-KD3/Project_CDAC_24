import { ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import "./App.css";
import Login from "./screens/Login";
import { Route, Routes } from "react-router-dom";
import Signup from "./screens/Signup";
import Home from "./screens/Home";
import RegistrationForm from "./screens/RegistrationPage";
import "./screens/styles.css";
import Centers from "./screens/Centers";
import CourseFee from "./screens/CourseFee";
import SeatAllotment from "./screens/SeatAlloment";
import Message from "./screens/Message";
import PrintReceipt from "./screens/PrintReceipt";

function App() {
  return (
    <div className="container">
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="login" element={<Login />} />
        <Route path="signup" element={<Signup />} />
        <Route path="home" element={<Home />} />
        <Route path="registration" element={<RegistrationForm />} />
        <Route path="centers" element={<Centers />} />
        <Route path="seatallotment" element={<SeatAllotment />} />
        <Route path="coursefee" element={<CourseFee />} />
        <Route path="message" element={<Message />} />
        <Route path="printreceipt" element={<PrintReceipt />} />
      </Routes>
      <ToastContainer />
    </div>
  );
}

export default App;
