import axios from 'axios';

const URL = 'http://localhost:10000/user';

export const getUsers = async() => {
  try{
    const res = await axios.get(`${URL}/select`);
    console.log(res);
    return res;
}
  catch(e){
    return e
  }    
    // .then((res) => {
    //   console.log(res);
    //   return res.data;
    // })
    // .catch((e) => {
    //   console.log(e);
    // });
};


export const saveUser = async(item) => {
  try{
    await axios.put(`${URL}/user/update`, item);
  }
  catch(e){
    console.log(e);
    return e;
  }

  console.log("save"+JSON.stringify(item));
};

export const deleteUser = () => {

};
