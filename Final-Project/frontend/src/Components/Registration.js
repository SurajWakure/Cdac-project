import React, { Component } from 'react';
import axios from "axios";
import './Registration.css';
import { Link } from "react-router-dom";


class Registration extends Component {
  state = {
    fullname: '',
    emailid: '',
    age: '',
    mobilenumber: '',
    username: '',
    password: '',
  };

  handleChange = (event) => {
    const { name, value } = event.target;
    this.setState({ [name]: value });
  };

  handleSubmit = (event) => {
    event.preventDefault();
    // handle form submission logic here
    axios
            .post("http://localhost:8080/healthcare/saveuser", this.state)
            .then(res => {
                console.log(res);
                window.location = 'http://localhost:3000/login';
            }
            );
  };

  render() {
    const { fullname, emailid, age, mobilenumber, username, password } = this.state;

    return (
      <div className="container text-center">
        <br />
        <br />

        <section className="background-radial-gradient overflow-hidden">
          <div className="container px-4 py-5 px-md-5 text-center text-lg-start my-5">
            <div className="row gx-lg-5 align-items-center mb-5">
              <div className="col-lg-6 mb-5 mb-lg-0" style={{ zIndex: '10' }}>
                <p
                  className="mb-4 opacity-70"
                  style={{ color: 'hsl(218, 81%, 85%)', textAlign: 'justify' }}
                >
                  We Believe in ‘Simplifying Healthcare, Impacting Lives!’. We are led by a young,
                  enthusiastic and forward-looking second-generation management and continue our
                  upward trajectory with a shared vision of delivering both excellence and trust.
                </p>
              </div>

              <div className="col-lg-6 mb-5 mb-lg-0 position-relative">
                <div
                  id="radius-shape-1"
                  className="position-absolute rounded-circle shadow-5-strong"
                ></div>
                <div id="radius-shape-2" className="position-absolute shadow-5-strong"></div>

                <div className="card bg-glass">
                  <div className="card-body px-4 py-5 px-md-5">
                    <form onSubmit={this.handleSubmit}>
                      <div className="row">
                        <div className="col-md-6 mb-4">
                          <div className="form-outline">
                            <input
                              onChange={this.handleChange}
                              value={fullname}
                              name="fullname"
                              placeholder="Full Name"
                              type="text"
                              id="form3Example1"
                              className="form-control"
                              required
                            />
                          </div>
                        </div>
                      </div>

                      <div className="form-outline mb-4">
                        <input
                          onChange={this.handleChange}
                          value={emailid}
                          name="emailid"
                          placeholder="Email ID"
                          type="email"
                          id="form3Example3"
                          className="form-control"
                          required
                        />
                      </div>

                      <div className="form-outline mb-4">
                        <input
                          onChange={this.handleChange}
                          value={age}
                          name="age"
                          placeholder="Age"
                          type="text"
                          id="form3Example3"
                          className="form-control"
                          required
                        />
                      </div>

                      <div className="form-outline mb-4">
                        <input
                          onChange={this.handleChange}
                          value={mobilenumber}
                          name="mobilenumber"
                          placeholder="Mobile No."
                          type="text"
                          id="form3Example3"
                          className="form-control"
                          />
                          </div>


                          <div className="form-outline mb-4">
                        <input
                          onChange={this.handleChange}
                          value={username}
                          name="username"
                          placeholder="User Name"
                          type="text"
                          id="form3Example3"
                          className="form-control"
                          />
                          </div>


                          <div className="form-outline mb-4">
                        <input
                          onChange={this.handleChange}
                          value={password}
                          name="password"
                          placeholder="Password"
                          type="text"
                          id="form3Example3"
                          className="form-control"
                          />
                          </div>
                          <button type="submit" class="btn btn-primary btn-block mb-4"> Sign up </button>

                                       

                            </form>
                         </div>
                     </div>
                    </div>
                </div>
            </div>
        </section>

 </div>



      
    );
}
}

export default Registration;