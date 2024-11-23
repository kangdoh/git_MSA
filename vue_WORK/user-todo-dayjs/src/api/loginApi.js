import axios from 'axios';

const url = 'https://localhost:20000';

export const login = async (code) => {
	try {
		const res = await axios.get(`${url}/kakao/login?code=${code}`);
		return res.data;
	} catch (err) {
		console.error(err);
		return err;
	}
};
export const msgSend = async (message) => {
	try {
		const res = await axios.get(`${url}/kakao/login?message=${message}`);
		// {header:{}}
		return res.data;
	} catch (err) {
		console.error(err);
		return err;
	}
};
