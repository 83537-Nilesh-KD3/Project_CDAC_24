import { Link } from "react-router-dom";
import Navbar from "../navbar/navbar";

function Message() {
  return (
    <>
      <div style={{ textAlign: "center", fontWeight: "bold" }}>
        <Navbar />
        <h1> Congratulations your payment is successfull !!</h1>

        <Link to="/printreceipt">
          <button>Print Receipt</button>
        </Link>
      </div>
    </>
  );
}
export default Message;
