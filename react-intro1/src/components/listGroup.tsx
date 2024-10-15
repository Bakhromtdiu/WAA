import {Fragment, useState} from "react";

interface Props {
    items: string[],
    heading: string,
    onSelectItem: (item: string) => void;
}

function ListGroup({items, heading, onSelectItem}: Props) {

    // const item = ['Bukhora', 'Samarkand', 'Navoi', 'Tashkent'];
    const [selectedIndex, setSelectedIndex] = useState(-1)
    // Update the event type to React.MouseEvent<HTMLLIElement, MouseEvent>
    const handleClicker = (event: React.MouseEvent<HTMLLIElement, MouseEvent>) => {
        console.log(event);  // or event.pageX / event.clientX depending on what you're looking for
    };

    const getMessage = () => {
        return items.length === 0 ? <p>list item is null</p> : null;
    };

    return (
        <Fragment>
            <h1>List</h1>
            {getMessage()}
            <ul className="list-group ">
                {items.map((item, index) =>
                    <li className={index === selectedIndex ? "list-group-item active" : "list-group-item"} key={item}
                        onClick={() => {
                            setSelectedIndex(index);
                            onSelectItem(item)
                        }}>{item}</li>
                )}
            </ul>
        </Fragment>
    );
}

export default ListGroup;
