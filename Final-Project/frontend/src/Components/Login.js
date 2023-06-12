
import React, { Component } from 'react';
import './Login.css';
import axios from 'axios';
import { Link, useHistory } from 'react-router-dom';

class Login extends Component {
  state = {
    username: '',
    password: '',
    test: null,
  };

  handleChange = (event) => {
    const { name, value } = event.target;
    this.setState({ [name]: value });
  };

  handleSubmit = async (event) => {
    event.preventDefault();
    const { username, password } = this.state;

    if (!username || !password) {
      alert('Please enter both username and password');
      return;
    }

    try {
      const response = await axios.post('http://localhost:8080/login/user', {
        username,
        password,
      });

      const loginDetails = response.data;
      localStorage.setItem('LoginDetails', JSON.stringify(loginDetails));

      if (loginDetails.length === 0) {
        this.setState({ test: 0 }, () => this.check());
      } else {
        this.setState({ test: 1 }, () => this.check());
      }
    } catch (error) {
      alert('An error occurred. Please try again.');
      console.log(error);
    }
  };

  check = () => {
    if (this.state.test === 1) {
      alert('Valid User');
      window.location = 'http://localhost:3000/details';
    } else if (this.state.test === 0) {
      alert('Invalid User');
    }
  };

  render() {
    const { username, password } = this.state;

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
                  Welcome back! Log in to your account.
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
                      <div className="form-outline mb-4">
                        <input
                          onChange={this.handleChange}
                          value={username}
                          name="username"
                          placeholder="Username"
                          type="text"
                          id="username"
                          className="form-control"
                          required
                        />
                      </div>

                      <div className="form-outline mb-4">
                        <input
                          onChange={this.handleChange}
                          value={password}
                          name="password"
                          placeholder="Password"
                          type="password"
                          id="password"
                          className="form-control"
                          required
                        />
                      </div>

                      <button type="submit" className="btn btn-primary btn-block mb-4">
                        Log In
                      </button>
                      <p>
                        New User?
                        <Link to="/register" className="btn btn-secondary btn-block">
                          Sign Up
                        </Link>
                      </p>
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

export default Login;

