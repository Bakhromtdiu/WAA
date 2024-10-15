interface Prop{
    str:string,
    meth:(str:string) => void
}

function Alert(str: string) {
    const alertMeth = (str) => {
        console.log(str)
    }
}

export default Alert