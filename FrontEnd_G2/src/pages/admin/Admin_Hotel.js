import React, { useState } from "react";
import StudentTable from "../../components/table/HotelTable";
import { useEffect } from 'react';
import { Link } from 'react-router-dom';

function HotelAdmin (){
    const [searchTerm, setSearchTerm] = useState('');
  const [data, setData] = useState([]);
  const [hotels, setHotels] = useState([]);
 
  const searchStudent = () => {
    console.log(searchTerm);
    console.log('students:');
    console.log(hotels);
    let result = null;

    if (searchTerm.length>0) {
        result = hotels.filter((hotel) => {
        let firstName = hotel.hotelName.toLowerCase();
        return firstName.indexOf(searchTerm.toLowerCase()) == 0;
      });
    } else {
      result = hotels;
    }
    console.log(result);
    setData(result);
  };
  useEffect(() => {
    console.log('app useeffect!!');
    let url = 'http://localhost:8080/api/hotel';
   
    console.log(url);
    fetch(url)
      .then((response) => response.json())
      .then((data) => {
        setData(data); 
        setHotels(data)
      });
  }, [searchTerm]);
  return (
    <div className="container">
      <Link to={'/useredit/new'}>
        <button
          className="btn btn-primary"
          type="button"
        >
          Add New
        </button>
      </Link>
      <h2>Danh sách khach san</h2>
      <div class="row">
        <div class="col-sm-6">
          <div className="input-group">
            <input
              type="text"
              className="form-control"
              value={searchTerm}
              onChange={(e) => setSearchTerm(e.target.value)}
            ></input>
            <div className="input-group-append">
              <button
                className="btn btn-secondary"
                type="button"
                 onClick={searchStudent}
              >
                <i class="fa fa-search"></i>
              </button>
            </div>
          </div>
        </div>
      </div>

      <StudentTable data={data}
       />
    </div>
  );
}

export default HotelAdmin;

