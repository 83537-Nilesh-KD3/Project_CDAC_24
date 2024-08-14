import { Link, useNavigate } from "react-router-dom";
import Navbar from "../navbar/navbar";

function SeatAllotment() {
  const navigate = useNavigate();

  const onApply = () => {
    navigate("/coursefee");
  };
  return (
    <>
      <Navbar />
      <div style={styles.container}>
        <div style={styles.card}>
          <h1 style={styles.heading}>Allotted Centre</h1>
          <h4 style={styles.subheading}>Sunbeam Karad</h4>
          <div style={styles.buttonContainer}>
            <button onClick={onApply} style={styles.button}>
              Apply
            </button>
            {/* <button  style={styles.button}>Back</button> */}
            <Link to="/centers">
              <button>Back</button>
            </Link>
          </div>
        </div>
      </div>
    </>
  );
}

const styles = {
  container: {
    display: "flex",
    justifyContent: "center",
    alignItems: "center",
    height: "calc(100vh - 60px)", // Reduced height
    marginTop: "20px", // Added margin to reduce the gap
    backgroundColor: "#f0f2f5",
    fontFamily: "'Segoe UI', Tahoma, Geneva, Verdana, sans-serif",
  },
  card: {
    backgroundColor: "#ffffff",
    padding: "20px 30px", // Reduced padding
    borderRadius: "10px",
    boxShadow: "0 4px 8px rgba(0, 0, 0, 0.1)",
    textAlign: "center",
  },
  heading: {
    fontSize: "2rem",
    color: "#333333",
    margin: "0 0 10px",
  },
  subheading: {
    fontSize: "1.5rem",
    color: "#555555",
  },
  buttonContainer: {
    marginTop: "20px",
    display: "flex",
    flexDirection: "column", // Stack buttons vertically
    alignItems: "center",
  },
  button: {
    margin: "10px 0", // Add space vertically between buttons
    padding: "10px 20px",
    backgroundColor: "#007bff",
    color: "#fff",
    border: "none",
    borderRadius: "5px",
    cursor: "pointer",
    fontSize: "1rem",
  },
};

export default SeatAllotment;
