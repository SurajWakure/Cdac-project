import React from 'react';

function ContactUs() {
  return (
    <div className="container">
      <header>
        <nav>
          <ul>
            <li><a href="/">Home</a></li>
            <li><a href="/service">Services</a></li>
            <li><a href="/doctors">Doctors</a></li>
            <li><a href="/contactus">Contact</a></li>
            <li><a href="/login">Login</a></li>
          </ul>
        </nav>
      </header>

      <section className="contact-section">
        <h2>Contact Us</h2>
        <p>If you have any questions or inquiries, please feel free to reach out to us.</p>
        <div className="contact-details">
          <div className="contact-card">
            <h3>Address</h3>
            <p>Shivajinagar, pune</p>
          </div>
          <div className="contact-card">
            <h3>Phone</h3>
            <p>123456789</p>
          </div>
          <div className="contact-card">
            <h3>Email</h3>
            <p>info@example.com</p>
          </div>
        </div>
      </section>

      <section className="contact-form-section">
        <h2>Send us a Message</h2>
        <form>
          <div className="form-field">
            <label htmlFor="name">Name</label>
            <input type="text" id="name" name="name" required />
          </div>
          <div className="form-field">
            <label htmlFor="email">Email</label>
            <input type="email" id="email" name="email" required />
          </div>
          <div className="form-field">
            <label htmlFor="message">Message</label>
            <textarea id="message" name="message" required></textarea>
          </div>
          <button type="submit" className="btn-primary">Send Message</button>
        </form>
      </section>

      <footer>
        <p>&copy; 2023 Healthcare Website. All rights reserved.</p>
      </footer>
    </div>
  );
}

export default ContactUs;
