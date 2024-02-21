import axios from 'axios';

export default axios.create({
  baseURL: 'http://localhost:7070/commondata',
  headers: {
    'Content-Type': 'application/json',
  },
});
