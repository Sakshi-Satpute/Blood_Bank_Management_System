import httpClient from './http-common';

const getVerifyEmail = (email) => {
    return httpClient.get(`http://localhost:7070/donor/verifyemail/${email}`);
  };

  const getVerifyMobile = (mobile) => {
    return httpClient.get(`http://localhost:7070/donor/verifymobile/${mobile}`);
  };

  const getDonorLogin = (email, password) => {
    return httpClient.get(`http://localhost:7070/donor/${email}/${password}`);
  };

  export default { getVerifyEmail, getVerifyMobile, getDonorLogin};