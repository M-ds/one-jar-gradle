import axios from "axios";
import {BaseService} from "@/service/BaseService";

export class PersonService extends BaseService {
  async getPersonWithAddress() {
    const httpResponse = await axios.get(`${this.BASE_URL}/api/person/1`);
    return httpResponse.data;
  }
}

export default new PersonService();
