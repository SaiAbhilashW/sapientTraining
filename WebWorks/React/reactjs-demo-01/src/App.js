import React, {Component} from 'react';

import AppHeader from './AppHeader';
import AppFooter from'./AppFooter';
import AppComponent from './AppComponent';
import AppContent from './AppContent';

import './App.css';
class App extends Component{
  render(){
     /*  const message = "Hello world from";
      const name = "Sai"; */ // Alt Shift A

      const footerProps = {
        website:'https://www.google.com',
        company: 'Google',
        year: 2019
      }

      return (
        <div className="App">
          <AppHeader company="Sapient Tech" createdBy="Sai"/>
          <AppComponent/>
          <AppContent/>
         {/*  <AppFooter website={footerProps.website} company={footerProps.company} year={footerProps.year}/> */}
         <AppFooter {...footerProps}/>
        </div>
      );
      
  }
}

export default App;