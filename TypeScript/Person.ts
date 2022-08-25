export interface Person {
    firstName: string,
    lastName: string,
    email: string,
    phone?: number,
    address: {
        city?: string,
        state: string
    }
}