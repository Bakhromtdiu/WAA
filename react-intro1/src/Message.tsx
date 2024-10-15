function Message() {
    //JSX: JavaScript XML
    const name = 'Bakhrom'
    if (name)
        return <div>Hello {name}</div>
    return <div>hello world</div>
}

export default Message;