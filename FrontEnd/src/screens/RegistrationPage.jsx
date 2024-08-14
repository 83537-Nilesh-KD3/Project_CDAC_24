import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

function RegistrationForm() {
  const [formData, setFormData] = useState({
    formNo: "",
    catRank: "",
    selectedCourses: [],
  });

  const courses = [
    { id: 1, courseName: "PG - DAC" },
    { id: 2, courseName: "PG - DBDA" },
    { id: 3, courseName: "PG - DESD" },
    { id: 4, courseName: "PG - DMC" },
    { id: 5, courseName: "PG - DITTIS" },
  ];

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  const handleCheckboxChange = (id) => {
    setFormData((prevState) => ({
      ...prevState,
      selectedCourses: prevState.selectedCourses.includes(id)
        ? prevState.selectedCourses.filter((courseId) => courseId !== id)
        : [...prevState.selectedCourses, id],
    }));
  };

  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    // Add form submission logic here
    console.log(formData);
  };

  const handleBack = () => {
    navigate("/login");
    console.log("Next button clicked");
  };

  const handleNext = () => {
    navigate("/centers");

    console.log("Back button clicked");
  };

  const thTdStyle = {
    width: "33.33%",
    padding: "8px 12px",
    border: "1px solid #ccc",
    textAlign: "left",
  };

  return (
    <div className="registration-form">
      <center>
        <h1>Student Registration</h1>
      </center>

      <form onSubmit={handleSubmit}>
        <div>
          <label>
            Form No:
            <input
              type="text"
              name="formNo"
              value={formData.formNo}
              onChange={handleInputChange}
              required
            />
          </label>
        </div>
        <div>
          <label>
            C-CAT Rank:
            <input
              type="text"
              name="catRank"
              value={formData.catRank}
              onChange={handleInputChange}
              required
            />
          </label>
        </div>
      </form>
      <center>
        <table>
          <thead>
            <tr>
              <th style={thTdStyle}>ID</th>
              <th style={thTdStyle}>Course Name</th>
              <th style={thTdStyle}>Select</th>
            </tr>
          </thead>
          <tbody>
            {courses.map((course) => (
              <tr key={course.id}>
                <td style={thTdStyle}>{course.id}</td>
                <td style={thTdStyle}>{course.courseName}</td>
                <td style={thTdStyle}>
                  <input
                    type="checkbox"
                    checked={formData.selectedCourses.includes(course.id)}
                    onChange={() => handleCheckboxChange(course.id)}
                  />
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </center>

      <div>
        <button type="button" onClick={handleNext}>
          Next
        </button>
        <button type="button" onClick={handleBack}>
          Back
        </button>
      </div>
    </div>
  );
}

export default RegistrationForm;
