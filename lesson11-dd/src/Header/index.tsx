export function Header() {
    return (
        <div>
            <div className="todo-header">
                <input type="text" placeholder="Enter task name" />
            </div>
            <ul className="todo-main">
                <li>
                    <label>
                        <input type="checkbox" />
                        <span>xxxxx</span>
                    </label>
                    <button className="btn btn-danger" style={{ display: 'none' }}>Delete</button>
                </li>
                <li>
                    <label>
                        <input type="checkbox" />
                        <span>yyyy</span>
                    </label>
                    <button className="btn btn-danger" style={{ display: 'none' }}>Delete</button>
                </li>
            </ul>
        </div>
    );
}
