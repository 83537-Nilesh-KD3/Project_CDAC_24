import { Link } from "react-router-dom";
import Navbar from "../navbar/navbar";

function CourseFee() {
  return (
    <>
      <div style={{ textAlign: "center", fontWeight: "bold" }}>
        <Navbar />
        <h1> Course Fee</h1>
        <h4> Rs. 94,500 </h4>
        <Link to="/message">
          <button>Pay Now</button>
        </Link>

        <Link to="/seatallotment">
          <button>Back</button>
        </Link>
      </div>
    </>
  );
}
export default CourseFee;
