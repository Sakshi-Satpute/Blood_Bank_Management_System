import httpClient from './http-common';

const getVerifyEmail = (email) => {
    return httpClient.get(`http://localhost:7070/bank/verifyemail/${email}`);
  };

  const getVerifyMobile = (mobile) => {
    return httpClient.get(`http://localhost:7070/bank/verifycontact/${mobile}`);
  };

  const getVerifyLicence = (licence) => {
    return httpClient.get(`http://localhost:7070/bank/verifylicence/${licence}`);
  };


  const getAllBank = () => {
    return httpClient.get(`http://localhost:7070/bank/info`);
  };

  const getAllPendingReqBank = () => {
    return httpClient.get(`http://localhost:7070/bank/pendinginfo`);
  };

  const getAllAcceptedBank = () => {
    return httpClient.get(`http://localhost:7070/bank/acceptedinfo`);
  };

  const getAllAcceptedBankByCity = (cityId) => {
    return httpClient.get(`http://localhost:7070/bank/acceptedinfo/city/${cityId}`);
  };

  const getAllAcceptedBankByDistrict = (districtId) => {
    return httpClient.get(`http://localhost:7070/bank/acceptedinfo/district/${districtId}`);
  };

  const getAllAcceptedBankByState = (stateId) => {
    return httpClient.get(`http://localhost:7070/bank/acceptedinfo/state/${stateId}`);
  };


  export default { getVerifyEmail, getVerifyMobile, getAllBank, getAllPendingReqBank, 
    getVerifyLicence, getAllAcceptedBank, getAllAcceptedBankByCity,getAllAcceptedBankByDistrict, getAllAcceptedBankByState};